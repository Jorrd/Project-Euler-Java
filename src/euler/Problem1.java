package euler;

public class Problem1 {
	
	public static int multiplesOf3and5(){
		int total = 0;
		for (int i = 1; i<1000; i++)
			if ( i%3 == 0 || i%5 == 0)
				total = total + i;		
		return total;
	}

}
