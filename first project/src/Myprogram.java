import java.util.Scanner;


public class Myprogram {
	
	public static void main(String []args)
	{
		//System.out.println("rohit talreja");
		//System.out.println("Neemuch");
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the price:");
		float price=sc.nextInt();
		
		System.out.println("enter the quantity:");
		int qua=sc.nextInt();
		float amount=qua*price;
		
		
		if(amount>=5000)
		{
			System.out.println("discount is 5%");
			float disc=.5f*amount;
		     amount = amount-disc;
		}
		else if(amount>=10000)
		{
			System.out.println("discount is 10%");
			float disc=.10f*amount;
		    amount = amount-disc;
			
		}
		else if(amount>=2000)
		{
			System.out.println("discount is 2%");
			float disc=.2f*amount;
		    amount = amount-disc;
		
		}

		System.out.println("total amount paid:- "+amount);
		
		
		
		
		
		//System.out.println("enter the len\n");
		
		//int len=sc.nextInt();

	//	System.out.println("enter the breadth:");
	
		//int breadth=sc.nextInt();
		
	//	int area=(len*breadth)/2;
	//	System.out.println("area of triangle \n"+area);
		
		
		
		
        
		
		
	}

}
