package patterns;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int k=1;
		char ch='A';
		do
		{
		System.out.println("enter your choice:");
		int a=sc.nextInt();
		
		
		switch(a)
		{
			case 1:
				for (int i=1; i<=5;i++)
		{
			for(int  j=5;j>=i;j--)
			{
				System.out.print("*");
		
			}
			System.out.println();
		}
				break;
			case 2:
				for(int i=1;i<=5;i++)
				{
					for(int j=1;j<=i;j++)
					{
						System.out.print(j);
						
					}
					System.out.println();
				}
				break;
			case 3:
				for(int i=1;i<=5;i++)
				{
					for(int j=0;j<=i+1;j++)
					{
						System.out.print(k++ +" ");
						
						
					}
					System.out.println();
				}
				break;
			case 4:
				for(int i=1;i<=5;i++)
				{
					for(int j=0;j<i+1;j++)
					{
						System.out.print(ch+" ");
						
						ch++;
						
					}
					
					System.out.println();
				}
				break; 
				default:
					System.out.println("invalid choice");
		}

				
		}while(true);
		
		

	}

}
