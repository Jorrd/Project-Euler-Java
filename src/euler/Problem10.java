package euler;

public class Problem10 {
	
	public static long primeSummation(){
		
		long total = 0;
		for (int i = 2; i<2000000; i++)
			if(primeCheckBool(i))
				total = total + i;
		return total;
		
	}
	
	public static boolean primeCheckBool(int x){
		for(int i = 2; i<=Math.sqrt(x); i++){
			if(x%i==0){
				return false;
			}
		}
		return true;
	}

}
