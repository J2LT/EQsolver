package com.solver.data.therme;

import java.util.ArrayList;

import com.solver.data.Therme;

public class Fraction extends Therme{
	
	private ArrayList<Therme> numerateur;
	private ArrayList<Therme> denominateur;

	public Fraction(String t, ArrayList<Therme> num, ArrayList<Therme> deno) {
		super(t);
		this.numerateur = num;
		this.denominateur = deno;
	}

	public ArrayList<Therme> getNum(){
		return this.numerateur;
	}
	
	public ArrayList<Therme> getDeno(){
		return this.denominateur;
	}
	
	public void setNum(ArrayList<Therme> a){
		this.numerateur = a;
		this.simplify();
	}
	
	public void setDeno(ArrayList<Therme> a){
		this.denominateur = a;
		this.simplify();
	}
	
}
