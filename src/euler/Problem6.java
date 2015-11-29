package euler;

public class Problem6 {
	
	public static int sumOfSquares(int x){
		int total = 0;
		for (int i = 1; i<=x; i++){
			total = total + (i*i);
		}
		return total;
	}
	
	public static int squareOfSum(int x){
		int total = 0;
		for (int i = 1; i <= x; i++){
			total = total + i;
		}
		total = total*total;
		return total;
	}
	
	public static int difference(int x, int y){
		int z = Math.abs(x-y);
		return z;
	}

}
