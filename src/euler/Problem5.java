package euler;

public class Problem5 {
	
	public static int smallestMultiple(){
		
		boolean numberFound = false;
		int loopsComplete = 0;
		int startNumber = 20;
		
		while (numberFound == false){
			startNumber++;
			
			for (int i = 10; i<= 20; i++){
				if (startNumber % i == 0){
					loopsComplete++;
				}else{
					break;
				}
			}
			
			if (loopsComplete < 10){
				loopsComplete = 0;
			}else{
				numberFound = true;
			}
		}
		
		return startNumber;
		
	}

}
