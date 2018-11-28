package com.ml.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ml.model.Dna;
import com.ml.model.Human;
import com.ml.model.Mutant;
import com.ml.repository.DnaRepository;

@Service("dnaService")
@Transactional
public class DnaServiceImpl implements DnaService {

	private static final Log log = LogFactory.getLog(DnaServiceImpl.class);
	private DnaRepository dnaRepository;

	@Autowired
	public DnaServiceImpl(DnaRepository dnaRepository){
		this.dnaRepository = dnaRepository;
	}

	public Dna saveDna(Dna dna) {
		return dnaRepository.saveDna(dna);
	}
	
	public Human saveDna(Human human) {
		return dnaRepository.saveDna(human);
	}

	public Mutant saveDna(Mutant mutant) {
		return dnaRepository.saveDna(mutant);
	}
	
  
	public int count(Dna dna) {
		return dnaRepository.count(dna);
		
	}

	public int count(Human human) {
		return dnaRepository.count(human);
	}

	public int count(Mutant mutant) {
		return dnaRepository.count(mutant);
	}
}