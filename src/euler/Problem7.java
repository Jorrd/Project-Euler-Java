package euler;

public class Problem7 {
	
	public static int primeFinder(int n){
		
		int currentPrimesFound = 0;
		int i = 1;
		
		while (currentPrimesFound < n){
			i++;
			if (primeCheckBool(i)){
				currentPrimesFound++;
			}
		}
		return i;
		
	}
	
	
	public static boolean primeCheckBool(long x){
		for(long i = 2; i<Math.sqrt(x)+1; i++){
			if(x%i==0){
				return false;
			}
		}
		return true;
	}

}
