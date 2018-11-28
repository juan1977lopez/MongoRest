package com.ml.exception;

import org.springframework.core.NestedRuntimeException;

public class DnaNotFoundException extends NestedRuntimeException {

	private static final long serialVersionUID = 1L;

	public DnaNotFoundException(String dna) {
        super(String.format("Dna not founded", dna));
    }
}
