package com.solver.data;

import java.util.ArrayList;

public class Equa {
	
	ArrayList add = new ArrayList();
	
	public Equa(){
	
		
		
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
