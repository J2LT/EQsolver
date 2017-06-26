package com.solver.data.equaType;

import java.util.ArrayList;

import com.solver.data.Therme;

public class Homographique{

	ArrayList<Therme> add = new ArrayList<Therme>();
	
	public Homographique(ArrayList<Therme> a){
		this.add = a;
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
