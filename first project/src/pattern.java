import java.util.Scanner;


public class pattern {
	
	
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num:-");
		num=sc.nextInt();
		

		for(int i=1;i<=10;i++)
		{
			System.out.println(num);
			num=num+5;
			
			
		}
	}
}
