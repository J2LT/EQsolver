package com.solver.Analyse;

public class replace {
	
	public static char[] multiHide(char tabIn[]){
    	int y = 0;
    	char tabOut2[] = new char[tabIn.length*2];
    	
    	for(int i = 0; i <= tabIn.length ; i = i+1 ) {
			if(tabIn[i] == '(' || tabIn[i] == '[') {
				String d = tabIn[i-1]+"";
				if(verifyNL.verifyNb(d) == true || verifyNL.verifyNb(d) == true) {
						tabOut2[y] ='*';
						y = y+1 ;
				}	
			}
			tabOut2[y]=tabIn[i];
			y = y+1;
    	}
    	char[] tabOut3 = new char[y];
    	for(int i = 0; i <= y; i = i+1){
    		tabOut3[y]=tabOut2[y];
    	}
    	return tabOut3;
    }
	
	public static char[] power(char tabIn[]) {
		for(int i = 0; i <= tabIn.length ; i = i+1 ) {
			if(tabIn[i] == '^') {
				String d = tabIn[i-1]+"";
				String v = tabIn[i+1]+"";
				boolean dn = verifyNL.verifyNb(d);
				boolean vl = verifyNL.verifyLe(v);
				boolean vn = verifyNL.verifyNb(v);
				if(dn == true) {
					if()
				}
			
				}
				
				else System.out.println ("code error: type de therme invalide");
			}
		}
	}
}

