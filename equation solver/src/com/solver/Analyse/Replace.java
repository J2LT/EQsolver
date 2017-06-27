package com.solver.Analyse;

public class Replace {
	
	public static char[] multiHide(char tabIn[]){
    	int y = 0;
    	char tabOut2[] = new char[tabIn.length*2];
    	
    	for(int i = 0; i <= tabIn.length ; i = i+1 ) {
			if(tabIn[i] == '(' || tabIn[i] == '[') {
				String d = tabIn[i-1]+"";
				if(VerifyNL.verifyNb(d) == true || VerifyNL.verifyNb(d) == true) {
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
				String b = tabIn[i-1]+"";
				String a = tabIn[i+1]+"";
				boolean bn = VerifyNL.verifyNb(b);
				boolean al = VerifyNL.verifyLe(a);
				boolean an = VerifyNL.verifyNb(a);
				if(bn == true) {
					if(a=="("){
						
					}
			
				}
				
				else System.out.println ("code error: type de therme invalide");
			}
		}
	}
}

