package euler;

public class Problem14 {
	
	public static int maxSearch(){
		
		long maxCount = 0L;
		int maxVal = 0;
		for (long i=1; i<1000001L; i++){
			if(collatzProblem(i) > maxCount){
				maxCount = collatzProblem(i);
				if (i > maxVal){
					maxVal = (int) i;
				}
			}
		}
		return maxVal;
		
	}
	
	public static int collatzProblem(long n){
		int count = 1;
		while (n!=1){
			count++;
			if (n%2 == 0){
				n = n/2;
			}else{
				n=(3*n)+1;
			}
		}
		return count;
	}

}
