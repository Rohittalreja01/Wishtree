package patterns;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) 
	{
		int flag=0,num;
		Scanner sc=new Scanner(System.in);
		
		
	   while(true)
		   {
		   System.out.println("enter number:-");
			num=sc.nextInt();
		   if(num<0)
		   {
			   System.out.println("negative num");
			   break;
		   }
			

		    if(num%2==0)
			{
				flag=1;
				System.out.println(" not prime");
			}
			if(flag==0)
			{
				System.out.println("  prime");
			}
		   }
	}

}
