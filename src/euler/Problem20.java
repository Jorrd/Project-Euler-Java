package euler;

import java.math.BigInteger;

public class Problem20 {
	
	public static int factorialDigitSum(){
		int counter = 0;
		String answer = String.valueOf(getFactorial(100));
		for (int j=0; j<answer.length(); j++){
			counter+= Character.getNumericValue(answer.charAt(j));
		}
		return counter;
	}
	
	public static BigInteger getFactorial(int num){
		BigInteger fact = BigInteger.valueOf(1);
		for (int i = 1; i <= num; i++)
			fact = fact.multiply(BigInteger.valueOf(i));
		return fact;
	}

}
