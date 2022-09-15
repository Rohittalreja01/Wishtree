import java.util.Scanner;


public class Ternary {
	public static void main (String[] args)
	{
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter quantity");
	int qua=s.nextInt();
	System.out.println("enter amount");
	float amount=s.nextFloat();
	
	float total=amount*qua;
	System.out.println("you pay:"+total);
	
	
	 String msg = total>=10000 ?total*10/100 +"10% disc":total>5000?total*5/100 +"5% disc":"no disc";
	 System.out.println("you get "+msg);
	 
	
	
	
	
	
	}

}
