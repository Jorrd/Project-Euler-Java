package euler;

public class Problem15 {
	
	public static long findAllPaths(int x, int y){	
		if(x == 0 || y == 0){			
			return 1;
		}else {
			return (findAllPaths(x-1, y) + findAllPaths(x, y-1));
		}
	}

}
