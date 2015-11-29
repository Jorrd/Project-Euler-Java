package euler;

public class Problem3 {
	
	public static long largestPrimeFactor(){
		long number = 600851475143L;
		long i = 2L;
		long largest = 1L;
		while (i < number/2 || number > 1){
			if (number%i==0){
				if(primeCheckBool(i)){
					largest = i;
				}
				number = number/i;
			}
			i++;
		}
		return largest;
	}
	
	public static boolean primeCheckBool(long x){
		for(int i = 2; i<=Math.sqrt(x); i++)
			if(x%i==0)
				return false;
		return true;
	}

}
