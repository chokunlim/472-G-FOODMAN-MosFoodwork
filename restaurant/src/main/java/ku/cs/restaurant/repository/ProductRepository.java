package ku.cs.restaurant.repository;

import ku.cs.restaurant.entity.Product;
import ku.cs.restaurant.entity.ProductStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
    List<Product> findByStatus(ProductStatus status);
    Optional<Product> findById(UUID id);
}
