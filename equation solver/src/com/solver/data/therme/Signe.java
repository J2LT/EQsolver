package com.solver.data.therme;

import com.solver.data.Therme;

public class Signe extends Therme{

	private char signe;
	
	protected Signe(String t, char s) {
		super(t);
		this.signe = s;
	}

	public char getSigne(){
		return signe;
	}
	
	
}
