package euler;

public class Problem12 {
	
	public static int triangleNumbers(){
		int holder = 0;
		while(holder < 500){
			int j = 0;
			for(int i=1; i<100000; i++){
				j = j+i;
				holder = factorCount(j);
				if (holder > 500){
					return j;
				}
			}
		}
		return 0;
	}
	
	public static int factorCount(int x){
		int count = 0;

		for(int i = 1; i<=Math.sqrt(x); i++){
			if(x%i==0){
				count+=2;
			}
		}
		return count;
	}

}
