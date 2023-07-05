package mate.academy.springboot.datajpa.repository;

import java.util.Collection;
import java.util.List;
import mate.academy.springboot.datajpa.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByPriceBetween(Float priceFrom, Float priceTo);

    List<Product> findAllByCategoryNameIn(Collection<String> categoryNames);
}
