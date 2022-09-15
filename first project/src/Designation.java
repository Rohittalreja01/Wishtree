import java.util.Scanner;


public class Designation {

	public static void main(String []args)
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter basic salary");
		int basicsal=s.nextInt();
		float da= .25f*basicsal;
		float hra=.30f*basicsal;
		float gross=basicsal+da+hra;
		if(gross>=40000 && gross<=60000)
		{
			System.out.println("ast manager");
		}
		else if(gross>=60000 && gross<=80000)
		{
			System.out.println(" manager");
		}
		else if(gross>80000 && gross<=100000)
		{
			System.out.println("ast vice president");
		}
		else if(gross>100000)
		{
			System.out.println("president");
			
		}
		else
		{
			System.out.println("officer");
		}
		
		
	}
}
