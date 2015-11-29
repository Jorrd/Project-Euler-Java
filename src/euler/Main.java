package euler;

public class Main {
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		System.out.println(solutionMessage(1) + Problem1.multiplesOf3and5());
		System.out.println(solutionMessage(2) + Problem2.fibonacci());
		System.out.println(solutionMessage(3) + Problem3.largestPrimeFactor());
		System.out.println(solutionMessage(4) + Problem4.largestPalindrome());
		System.out.println(solutionMessage(5) + Problem5.smallestMultiple());
		System.out.println(solutionMessage(6) + Problem6.difference(
												Problem6.sumOfSquares(100),
												Problem6.squareOfSum(100)));
		System.out.println(solutionMessage(7) + Problem7.primeFinder(10000));
		System.out.println(solutionMessage(8) + Problem8.maxProduct());
		System.out.println(solutionMessage(9) + Problem9.pythagTriplet());
		System.out.println(solutionMessage(10) + Problem10.primeSummation());
		System.out.println(solutionMessage(11) + Problem11.maxProduct());
		System.out.println(solutionMessage(12) + Problem12.triangleNumbers());
		// Needs substringing to the first 10 digits.
		System.out.println(solutionMessage(13) + Problem13.multiplying());
		System.out.println(solutionMessage(14) + Problem14.maxSearch());
		// Do not run this - it takes fucking ages.
		//System.out.println(solutionMessage(15) + Problem15.findAllPaths(20, 20));
		
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Program took: " + (endTime - startTime) + "ms to run.");
	}
	
	
	public static String solutionMessage(int n){
		return "The solution to Problem " + n + " is: ";
	}

}
