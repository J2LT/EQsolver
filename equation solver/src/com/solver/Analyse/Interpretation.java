package com.solver.Analyse;
	public class Interpretation {

	Equa e = new Equa();
		
	    public static Equa multiHide(String s){

	    	char[] tab = s.toCharArray();
	    	char[] tabOut = s.toCharArray();
	    	int y = 0;
	    	
	    	for(int i = 0; i <= tab.length ; i = i+1 ) {
				if(tab[i] == '(' || tab [i] == '[') {
					String d = tab[i]+"";
					if(verifyNL.verifyNb(d) == true || verifyNL.verifyNb(d) == true) {
						for(int u = 0; u <= tab.length + 1 ; u = u+1) {
							if(u == i) {
								tabOut[u] = '*';
								u = u+1 ;
							}
							tabOut[u] = tab[y];
							y = y+1 ;
						}
					}
				}
	    	}
	    	
	    	
					    

	        Equa();
	    }
	}

