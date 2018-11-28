package com.ml.controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ml.model.Human;
import com.ml.model.Mutant;
import com.ml.model.StatsResponse;
import com.ml.service.DnaService;

@Controller
@RestController
@RequestMapping("dna")
public class DnaController {

	private static final Log log = LogFactory.getLog(DnaController.class);

	private final DnaService dnaService;

//	private Dna dna;
	private Human human;
	private Mutant mutant;
//	private double ratio;
	private int count_mutant_dna;
	private int count_human_dna;
	
	@Autowired
	public DnaController(DnaService dnaService) {
		this.dnaService = dnaService;
	}

	@RequestMapping(value="/stats", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<StatsResponse> countHuman(){
		
		count_human_dna=dnaService.count(human);
		count_mutant_dna=dnaService.count(mutant);
		
		StatsResponse statsResponse = new StatsResponse(count_human_dna, count_mutant_dna);
		
		log.info("Get stats");
		return ResponseEntity.ok(statsResponse);
	}

	@RequestMapping(value="/human",method=RequestMethod.POST)
	public  ResponseEntity<Human> saveDna(@RequestBody @Valid Human dna){
		log.info("Save new human");
		return ResponseEntity.ok(dnaService.saveDna(dna));
	}
	
	@RequestMapping(value="/mutant",method=RequestMethod.POST)
	public  ResponseEntity<Mutant> saveDna(@RequestBody @Valid Mutant dna){
		log.info("Save new mutant");
		return ResponseEntity.ok(dnaService.saveDna(dna));
	}
	
}
