package online.inloco.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import online.inloco.product.entity.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {

	Store findByCode(String code);

}
