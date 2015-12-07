package euler;

public class Problem17 {
	
	public static int sumOfLetters(){
		
		String[] arraySingles = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] arrayTeens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
							   "seventeen", "eighteen", "nineteen"};
		String[] arrayTens = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
		String[] arrayHundreds = {"OneHundred", "TwoHundred", "ThreeHundred", "FourHundred", "FiveHundred",
								  "SixHundred", "SevenHundred", "EightHundred", "NineHundred"};
		int total1 = 0, total2 = 0, total3 = 0, total4 = 0, total5 = 0, total6 = 0, total7 = 0, total8 = 0, total9 = 0, total10 = 0;
		
		
		for (int i=0; i<arraySingles.length; i++){
			total1 = total1 + arraySingles[i].length();
		}
		for (int j=0; j<arrayTeens.length; j++){
			total2 = total2 + arrayTeens[j].length();
		}
		
		for (int l=0; l<arrayTens.length; l++){
			total3 = total3 + arrayTens[l].length();
		}
		
		for (int k=0; k<arrayTens.length; k++){
			for (int l=0; l<arraySingles.length; l++){
				total4 = total4 + arrayTens[k].length() + arraySingles[l].length();
			}
		}
		
		for (int h=0; h<arrayHundreds.length; h++){
			total9 = total9 + arrayHundreds[h].length();
		}
		
		for (int c=0; c<arrayHundreds.length; c++){
			for (int d=0; d<arrayTens.length; d++){
				total5 = total5 + arrayHundreds[c].length() + arrayTens[d].length() + 3;
			}
		}
		
		for (int a=0; a<arrayHundreds.length; a++){
			for (int b=0; b<arrayTeens.length; b++){
				total6 = total6 + arrayHundreds[a].length() + arrayTeens[b].length() + 3;
			}
		}
		
		for (int e=0; e<arrayHundreds.length; e++){
			for (int f=0; f<arrayTens.length; f++){
				for (int g=0; g<arraySingles.length; g++){
					total7 = total7 + arrayHundreds[e].length() + arrayTens[f].length() + arraySingles[g].length() + 3;
				}
			}
		}
		
		for (int x=0; x<arrayHundreds.length; x++){
			for (int z=0; z<arraySingles.length; z++){
				total10 = total10 + arrayHundreds[x].length() + arraySingles[z].length() + 3;
			}
		}
		
		String thousand = "OneThousand";
		
		total8 = thousand.length();
	
		
		
		
		return (total1 + total2 + total3 + total4 +
				total5 + total6 + total7 + total8 +
				total9 + total10);
	}

}