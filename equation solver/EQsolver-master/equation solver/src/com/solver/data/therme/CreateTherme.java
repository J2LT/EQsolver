package com.solver.data.therme;

import com.solver.data.Therme;

public class CreateTherme {

	public Therme create(String s, char signe, char name, double exposant, double coef, double valeur){
		
		if(s.equals("signe")){
			if(signe == '+' || signe == '-' || signe == '*' || signe == '/' || signe == '(' || signe == ')' || signe == '[' || signe == ']'){
				Signe si = new Signe(s, signe);
				return si;
			}else{
				System.out.println("code error: signe invalide");
				return null;
			}
		}else if(s.equals("variable")){
			Variable var = new Variable(s,name,exposant,coef);
			return var;
		}else if(s.equals("constante")){
			Constante c = new Constante(s, valeur);
			return c;
		}else{
			System.out.println("code error: type de therme invalide");
			return null;
		}
	}
}
