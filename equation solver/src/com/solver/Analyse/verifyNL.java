package com.solver.Analyse;

	public class verifyNL {
		
    	static char listLe[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    	static char listNb[] = {'0','1','2','3','4','5','6','7','8','9'};
    	static boolean verifNb;
		static boolean verifLe; 
    	
	    public static boolean verifyNb(String s){	
	    	String d = "";

	    	for( int i = 0 ;  i <= 10 ; i = i+1)
	    		d = listNb[i]+"";
	    		if(s == d) {
	    			verifNb = true;
	    		}
	    		else {
	    			verifNb = false;
	    		}
				return verifNb;
	    }
	    
	    
	     public static boolean verifyLe(String s){	
	    	 String d = "";
	    	 for( int i = 0 ;  i <= 26 ; i = i+1)
	    	   	d = listLe[i]+"";
   	    		if(s == d) {
		  			verifLe = true;
	     		}
	  	   		else {
	  	   			verifLe = false;
	       		}
				return verifLe;
	    		    		
	    }
	}

