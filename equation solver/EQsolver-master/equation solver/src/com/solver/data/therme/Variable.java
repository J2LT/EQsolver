package com.solver.data.therme;

import com.solver.data.Therme;

public class Variable extends Therme{

	char name;
	double exposant;
	double coefiantMultiplicatif;
	
	protected Variable(String t, char n, double e, double c) {
		super(t);
		this.name = n;
		this.exposant = e;
		this.coefiantMultiplicatif = c;
		
	}

}
