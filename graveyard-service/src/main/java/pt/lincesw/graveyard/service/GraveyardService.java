package pt.lincesw.graveyard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import pt.lincesw.graveyard.entity.Graveyard;
import pt.lincesw.graveyard.repository.GraveyardRepository;

@Service
@Slf4j
public class GraveyardService {

	@Autowired
	private GraveyardRepository graveyardRepository;

	public Graveyard saveGraveyard(Graveyard Graveyard) {
		log.info("Inside saveGraveyard method of GraveyardService.");
		return graveyardRepository.save(Graveyard);
	}

	public Graveyard findGraveyardByCode(String code) {
		log.info("Inside findGraveyardByCode method of GraveyardService.");
		return graveyardRepository.findByCode(code);
	}
	
}
