package com.ml.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import com.ml.model.Dna;
import com.ml.model.Human;
import com.ml.model.Mutant;

@Repository
public class DnaRepositoryImpl implements DnaRepository{

	private final MongoOperations mongoOperations;

	@Autowired
	public DnaRepositoryImpl(MongoOperations mongoOperations) {
		Assert.notNull(mongoOperations);
		this.mongoOperations = mongoOperations;
	}

	@Override
	public Dna saveDna(Dna dna) {
		this.mongoOperations.save(dna);
		return dna;
	}
	
	public Human saveDna(Human human) {
		this.mongoOperations.save(human);
		return human;
	}
	
	public Mutant saveDna(Mutant mutant) {
		this.mongoOperations.save(mutant);
		return mutant;
	}

	public int count(Dna dna) {
		return (int) this.mongoOperations.count(null, Dna.class);
	}
	
	public int count(Human human) {
		return (int) this.mongoOperations.count(null, Human.class);
	}
	
	public int count(Mutant mutant) {
		return (int) this.mongoOperations.count(null, Mutant.class);
	}

}
