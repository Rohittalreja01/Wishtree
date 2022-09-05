package patterns;

import java.util.Scanner;

public class Automorphic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to check");
		int num=sc.nextInt();
		int sq=num*num;
		int temp=sq;
	
		while(temp!=0)
		{
		  int rem1=temp%10;
		  int rem2=num%10;
		  if(rem2==rem1)
		  {
			  flag=1;
			  
		  }
		  temp=temp/10;
		  num=num/10;
				
			
		}
		if(flag==1)
		{
			System.out.println("automorphic");
		}
		else
			System.out.println("not automorphic");
	}

}
