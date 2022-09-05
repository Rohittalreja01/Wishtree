package patterns;

import java.util.Scanner;

public class Airlines {
	String airlineName;
	String city;
	String destination;
	int fare;
	void show()
	{   Scanner sc=new Scanner(System.in);
	     System.out.println("enter fare:");
	     fare=sc.nextInt();
	     System.out.println("name of airline:");
	     airlineName=sc.next();
	     System.out.println("name of city:");
	     city=sc.next();
	     System.out.println("name of destination");
	     destination=sc.next();
	     
	
	}
	void printDetails()
	{
		System.out.println("name is "+airlineName);
		System.out.println("city is "+city);
		System.out.println("destination is "+destination);
		System.out.println("fare is "+fare);
	}
	public static void main(String args[])
	{
		Airlines ar=new Airlines();
		ar.show();
		ar.printDetails();
	}

}
