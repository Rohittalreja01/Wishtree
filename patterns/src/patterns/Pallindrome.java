package patterns;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		
		
		int num,temp,n=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:-");
		num=sc.nextInt();
		temp=num;
		loop1: for(int i=0;i<=5;i++)
		{
		
			System.out.println("enter number:-");
			num=sc.nextInt();
			if(num<0)
			{
				break loop1;
			}
		while(num>0)
		{
			rem=num%10;
			n=(n*10)+rem;
			num=num/10;
			
		}
		if(temp==n)
		{
			System.out.println("palindrome");
			
		}
		else
			System.out.println("not palindrome");
		}
	}

}
