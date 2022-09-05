package patterns;

import java.util.Scanner;

public class Movie {
	int pizza,puff,cooldrinks;
	int prize;
	Scanner sc=new Scanner(System.in);
	
	void getDetails()
	{

		System.out.println("enter nof of pizza");
		int pizza=sc.nextInt();
		System.out.println("enter nof of puffs");
		int puff=sc.nextInt();
		System.out.println("enter nof of cooldrinks");
		int cooldrinks=sc.nextInt();
		
		
	}
	void calculate()
	{
		int prize=pizza*100+puff*20+cooldrinks*10;
	}
	void display()
	{
		System.out.println("nof of pizz"+pizza);
		System.out.println("nof of puff"+puff);
		System.out.println("nof of cooldrinks"+cooldrinks);
		System.out.println("total bill:"+prize+" enjoy");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m=new Movie();
		m.getDetails();
		m.calculate();
		m.display();
		

	}

}
