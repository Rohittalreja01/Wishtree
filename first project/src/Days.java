import java.util.Scanner;


public class Days {

	public static void main(String []args)
	{
		int days,yr,month;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter days:");
		days=s.nextInt();
		yr=days/365;
		month=(days-yr*365)/30;
		int d=days-yr*365-month*30;
		System.out.println("\n no of yr:"+yr+"\n no of month:"+month+"\nno of days:"+d);		
		
	}
}
