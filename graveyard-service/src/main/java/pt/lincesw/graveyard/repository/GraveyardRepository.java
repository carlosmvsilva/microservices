package pt.lincesw.graveyard.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pt.lincesw.graveyard.entity.Graveyard;

@Repository
public interface GraveyardRepository extends JpaRepository<Graveyard, Long>{

	Graveyard findByCode(String code);

}
