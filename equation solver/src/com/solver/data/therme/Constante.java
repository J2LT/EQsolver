package com.solver.data.therme;

import com.solver.data.Therme;

public class Constante extends Therme{
	
	private double valeur;

	protected Constante(String t, double v) {
		super(t);
		this.valeur = v;
	}

	public void setValue(double d){
		this.valeur = d;
	}
	
	public double getValue(){
		return valeur;
	}
}
