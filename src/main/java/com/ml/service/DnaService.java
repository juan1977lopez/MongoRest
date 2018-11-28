package com.ml.service;

import com.ml.model.Dna;
import com.ml.model.Human;
import com.ml.model.Mutant;

public interface DnaService {

	Dna saveDna(Dna dna);
	Human saveDna(Human human);
	Mutant saveDna(Mutant human);
	
	int count(Dna dna);
	int count(Human human);
	int count(Mutant mutant);

}
