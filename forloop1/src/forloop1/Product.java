package forloop1;

import java.util.Scanner;

public class Product {

	public static void main(String []args)
	{
		System.out.print("enter a num:");
		Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		 int n = num;
         
         
         int product = 1;
         
         while(n>0){
             int digit = n%10;
             
             product *= digit;
             
             n/=10;
         }
         
         System.out.println("Product of digits of the number "+num+" is "+product+" .");
      
		 
		
	}
}
