public class New {


	public static void main(String[] args) {
          int j,i;
          System.out.println("*");
          
		for ( i = 1; i <=5; i++) {
				System.out.print("*");
			for ( j = 1; j <= i; j++)
			{
				System.out.print(j);
			}
				for(int k=i-1;k>=1;k--)
				{
					System.out.print(k);
				}
				
				System.out.print("*");
			System.out.println();
		}
		for ( i = 4; i>=1; i--) {
			System.out.print("*");
		for ( j = 1; j <= i; j++)
		{
			System.out.print(j);
		}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(k);
			}
			
			System.out.print("*");
		System.out.println();

	}
		System.out.println("*");
	}

}