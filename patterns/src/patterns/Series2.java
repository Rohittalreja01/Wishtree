package patterns;

import java.util.Scanner;

public class Series2 {

	public static void main(String[] args) {
	
		int i,num,n=2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ");
		num=sc.nextInt();

		loop: for(i=2;i<=num;i++)
		{
			 n=n*2-1;
			 System.out.print(n+",");
		}

	}

}
