import java.util.Scanner;


public class PASS {

	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter marks of physics:");
		float phy=s.nextFloat();
		
		System.out.println("enter marks of chemistry:");
		float chem=s.nextFloat();
		
		System.out.println("enter marks of maths:");
		float mat=s.nextFloat();
		float marks=chem+phy+mat;
		float per=(marks/300)*100;
		if(per>=40 && per<=50)
		{
			System.out.println("pass");
		}
		else if(per>50 && per<=60)
		{
			System.out.print("B");
		}
		else if(per>60 && per<=80)
		{
			System.out.println("A");
		}
		else if(per>80) {
			System.out.println("A+");
		}
		else
			System.out.println("fail");
		
		
	}
}
