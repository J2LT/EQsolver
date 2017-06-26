package com.solver.data.equaType;

import java.util.ArrayList;

import com.solver.data.Therme;

public class Racine{

	ArrayList<Therme> add = new ArrayList<Therme>();
	int ordre;
	
	public Racine(ArrayList<Therme> a, int i){
		this.add = a;
		this.ordre = i;
	}
	
	public void addTherme(Therme t){
		add.add(t);
	}
	
	public Therme getTherme(int i){
		return (Therme) add.get(i);
	}
	
	public void removeTherme(int i){
		add.remove(i);
	}
}
