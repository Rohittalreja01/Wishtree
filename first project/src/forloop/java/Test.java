package forloop.java;

import java.util.Scanner;

public class Test {
    

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter :");
		int num=sc.nextInt();
		int flag=0;
		while(num>0)
		{
			if(num%2==0)
			{
				flag=1;
		        break;
			}
			if(flag==0)
			{
				System.out.println("prime");
			}
			else
				System.out.println("not");
			}
	}
	}

	
