package patterns;

import java.util.Scanner;

public class Theatre {
	
	String theatreName;
	String Movie;
	int ticketPrice;
	String coupon;
	int disc;
	
	
	void calculatePrice()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter movie name:");
		Movie=sc.next();
		System.out.println("enter ticket price:");
		ticketPrice=sc.nextInt();
		System.out.println("enter coupon:");
		coupon=sc.next();
		
		if(coupon.equals("GOLD"))
		{    disc=ticketPrice*10/100;
			ticketPrice=ticketPrice-disc;
			System.out.println("he will get 10% discount");
			System.out.println("ticket price"+ticketPrice);
		}
		if(coupon.equals("platinum"))
			
		{
			ticketPrice=ticketPrice-(ticketPrice*7%100);
			System.out.println("he will get 7% discount");
		}
		if(coupon.equals("silver"))
			ticketPrice=ticketPrice-(ticketPrice*5%100);
		{
			System.out.println("he will get 5% discount");
		}
	    if(coupon.equals("no"))
			{
				System.out.println("he will get no discount");
			}
		}
	void show()
	{
		System.out.println(Movie);
		System.out.println(coupon);
		
	}
	public static void main(String []args)
	{
		Theatre th=new Theatre();
		th.calculatePrice();
		th.show();
	}
	}



