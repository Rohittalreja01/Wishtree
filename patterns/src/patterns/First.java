package patterns;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
	int result=12;
	int num;
	int guess=0;
	Scanner sc=new Scanner(System.in);

	do
	{   
		num=sc.nextInt();

          guess++;
		if (num>result)
		{
			System.out.println("enter a smaller num");
			System.out.println("total guess:"+guess);
			
		}
		else if(num<result )
		{
			System.out.println("enter a greater num");
		
			
		}
		else if(num==result)
		{
			System.out.println("guess is right");
		
		}
		
	}while(num>0);
	
	
		
	}

}
