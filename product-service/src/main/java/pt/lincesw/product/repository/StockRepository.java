package pt.lincesw.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pt.lincesw.product.entity.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {

}
