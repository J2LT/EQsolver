package com.EQsolver.Main;

import java.util.Scanner;

import com.solver.Analyse.Interpretation;
import com.solver.data.Equa;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		enter();

	}
	
	public static void enter(){
		 
		String saisie = sc.toString();
		Equa e = Interpretation.interpretation(saisie);
	}

}
