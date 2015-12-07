package euler;

public class Problem15 {
	
	public static long getResult(){
		long result = 1;
		long divisor = 2;
		
		for (int i = 21; i <= 40; i++){
			result = result*i;
			
			while (divisor<=20 && result%divisor == 0){
				result = result / divisor;
				divisor++;
			}
		}
		return result;
	}

}
