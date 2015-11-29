package euler;

public class Problem9 {
	
	public static int pythagTriplet(){
		int answer=0;
		for (int a = 1; a<500; a++)
			for (int b = 1; b<500; b++)
				for (int c = 1; c<500; c++)
					if((a*a) + (b*b) == (c*c))
						if(a+b+c == 1000)
							if(a<b && b<c)
								answer = a*b*c;
		return answer;
	}
}
