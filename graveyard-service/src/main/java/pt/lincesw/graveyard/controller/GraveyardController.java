package pt.lincesw.graveyard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import pt.lincesw.graveyard.entity.Graveyard;
import pt.lincesw.graveyard.service.GraveyardService;

@RestController
@RequestMapping("/graveyards")
@Slf4j
public class GraveyardController {

	@Autowired
	private GraveyardService graveyardService;
	
	@PostMapping("/")
	public Graveyard saveGraveyard(@RequestBody Graveyard Graveyard) {
		log.info("Inside saveGraveyard method of GraveyardController");
		return graveyardService.saveGraveyard(Graveyard);
	}
	
	@GetMapping("/{code}")
	public Graveyard findGraveyardByCode(@PathVariable("code") String code) {
		log.info("Inside findGraveyardByCode method of GraveyardController");
		return graveyardService.findGraveyardByCode(code);
	}
}
