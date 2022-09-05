package patterns;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		int i,num,n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ");
		num=sc.nextInt();

		for(i=1;i<=num;i++)
		{
			 n=n*2+1;
			 System.out.print(n+",");
		}

	}

}
