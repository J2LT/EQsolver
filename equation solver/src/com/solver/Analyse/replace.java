package com.solver.Analyse;

public class replace {
	
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
	
	public static char[] power(char tabIn[]) {
		for(int i = 0; i <= tabIn.length ; i = i+1 ) {
			if(tabIn[i] == '^') {
				String d = tabIn[i-1]+"";
				String v = tabIn[i+1]+"";
				boolean dl = verifyNL.verifyLe(d);
				boolean dn = verifyNL.verifyNb(d);
				boolean vl = verifyNL.verifyLe(v);
				boolean vn = verifyNL.verifyNb(v);
				if(n == true) {
					
				}
				else if(l == true){
					
				}
				else System.out.println ("code error: type de therme invalide");
			}
		}
	}
}

