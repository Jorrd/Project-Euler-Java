package euler;

import java.math.BigInteger;

public class Problem16 {
	
	public static int powerSum(){
		BigInteger bi1, bi2;
		int exponent = 1000, total = 0;
		bi1 = new BigInteger("2");
		bi2 = bi1.pow(exponent);
		String answer = String.valueOf(bi2);

		for(int i=0; i<answer.length(); i++){
			total += Character.getNumericValue(answer.charAt(i));
		}
		
		return total;
	}

}
