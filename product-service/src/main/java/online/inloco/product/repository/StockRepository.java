package online.inloco.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import online.inloco.product.entity.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {

}
