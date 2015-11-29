package euler;

public class Problem2 {
	
	public static int fibonacci(){
		int oldNumber = 1;
		int newNumber = 1;
		int holdingSpace;
		int total = 0;
		while(oldNumber < 4000000){
			if (oldNumber%2 == 0){
				total = total + oldNumber;
			}
			holdingSpace = oldNumber;
			oldNumber = newNumber;
			newNumber = oldNumber + holdingSpace;
		}
		
		return total;
	}

}
