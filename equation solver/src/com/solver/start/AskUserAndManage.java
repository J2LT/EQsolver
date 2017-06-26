package com.solver.start;

import java.util.Scanner;

import com.solver.Analyse.Interpretation;
import com.solver.data.Equa;

public class AskUserAndManage {

	private static Scanner sc = new Scanner(System.in);
	
	public static void manage(){
		
		String saisie = sc.toString();
		Equa e = Interpretation.interpretation(saisie);
		//trouver type et si pas possible simplifier
		//trouver type si pas encore trouver
		//resoudre
		//sortir resulta
		
	}
}
