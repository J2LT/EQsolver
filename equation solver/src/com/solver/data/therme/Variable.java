package com.solver.data.therme;

import com.solver.data.Therme;

public class Variable extends Therme{

	private char name;
	private double exposant;
	private double coefiantMultiplicatif;
	
	protected Variable(String t, char n, double e, double c) {
		super(t);
		this.name = n;
		this.exposant = e;
		this.coefiantMultiplicatif = c;
		
	}

	public void setName(char c){
		this.name = c;
	}
	
	public char getName(){
		return this.name;
	}
	
	public void setExposant(double d){
		this.exposant = d;
	}
	
	public double getExposant(){
		return this.exposant;
	}
	
	public void setCoef(double d){
		this.coefiantMultiplicatif = d;
	}
	
	public double getCoef(){
		return this.coefiantMultiplicatif;
	}
}
