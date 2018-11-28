package com.ml.repository;

import com.ml.model.Dna;
import com.ml.model.Human;
import com.ml.model.Mutant;

public interface DnaRepository {

	public Dna saveDna(Dna dna);
	public Human saveDna(Human human);
	public Mutant saveDna(Mutant human);

	int count(Dna dna);
	int count(Human human);
	int count(Mutant mutant);
	
}
