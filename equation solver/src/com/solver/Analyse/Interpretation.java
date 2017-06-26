package com.solver.Analyse;

import java.util.ArrayList;

import com.solver.data.Equa;

public class Interpretation {
	
		public static Equa interpretation(String s){
			char[] tabIn = s.toCharArray();
			
			char tabOut1[] = multiHide(tabIn);
			Equa e = new Equa();
			
			
		
			
			
			
			return e;
		}
		
	    public static char[] multiHide(char tabIn[]){
	    	int y = 0;
	    	char tabOut2[] = new char[tabIn.length*2];
	    	
	    	for(int i = 0; i <= tabIn.length ; i = i+1 ) {
				if(tabIn[i] == '(' || tabIn[i] == '[') {
					String d = tabIn[i]+"";
					if(verifyNL.verifyNb(d) == true || verifyNL.verifyNb(d) == true) {
						for(int u = 0; u <= tabIn.length + 1 ; u = u+1) {
							if(u == i) {
								tabOut2[u] ='*';
								u = u+1 ;
							}
							tabOut2[u] = '*';
							y = y+1 ;
						}
					}
				}
	    	}
	    	return tabOut2;
	    }
	}

