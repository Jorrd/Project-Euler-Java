package euler;

public class Problem4 {
		
	public static int largestPalindrome(){
		
		int currentLargest = 0;
		
		for (int i=100; i<1000; i++){
			for (int j=100; j<1000; j++){
				int product = i*j;
				
				if (isPalindrome(Integer.toString(product))){
					if (product > currentLargest){
						currentLargest = product;
					}
				}
			}
		}
		return currentLargest;
	}
	
	public static boolean isPalindrome(String s){
		
		String reversed = "";
		for(int i=s.length(); i>0; i--){
			reversed = reversed + s.charAt(i-1);
		}
		
		if(s.equals(reversed)){
			return true;
		}
		
		return false;
	}

}
