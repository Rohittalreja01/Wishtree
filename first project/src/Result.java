import java.util.Scanner;


public class Result {
	
	public static void main(String args[])
	{
		int marks;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the marks:");
		marks=sc.nextInt();
		
		if(marks>=40)
		{
			System.out.println("pass");
			
		}
		else
			System.out.print("fail");
		
	}

}
