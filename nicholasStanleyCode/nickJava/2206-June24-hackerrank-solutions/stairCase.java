public class Steps{
	

	public static void staircase(int n){
		int k = n;
		for (int i=o; i< k; i++)
		{
			for(int emptySpace = n-1;  emptySpace > 0 ; emptySpace--)
			{
				System.out.print("");
		
				for (int j=0; j<=i; j++)
				{
					System.out.print("#");
				}
			}
			
			n--;
			System.out.println("");
		}		
}

