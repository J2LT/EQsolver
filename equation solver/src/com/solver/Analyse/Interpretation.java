package com.solver.Analyse;

import com.solver.data.Equa;

public class Interpretation {
	
		public static Equa interpretation(String s){
			
			char[] tabIn = s.toCharArray();
			char tabOut1[] = Replace.multiHide(tabIn);
			Equa e = new Equa();
			
			
			
		
			
			
			
			return e;
		}
		
		public static char[] findParenthese(char[] c, int i){

            char caract = c[i];
            int nbrOpen = 1;
            int indexEnd = 0;

            for(int i2 = i+1; nbrOpen != 0; i2++){
                if(c[i2] == '(' || c[i2] == '['){
                    nbrOpen = nbrOpen + 1;
                }else if(c[i2] == ')' || c[i2] == ']'){
                    nbrOpen = nbrOpen - 1;
                }

                if(nbrOpen == 0){
                    indexEnd = i2;
                }
            }

            char tabOut[] = new char[indexEnd - i - 1];

            int index = 0;

            for(int i3 = i+1; i3 < indexEnd -1; i3++,index++){
                tabOut[index] = c[i3];
            }

            return tabOut;
        }
	}

