import java.util.Scanner;


public class Greatest {
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number1:");
		int n1=s.nextInt();
		/*if(n1%3==0 && n1%8==0)
		{
			System.out.println("valid num");
		}
		else
			System.out.println("invalid num");*/
		
		String msg=(n1%3==0&&n1%8==0)?"valid num": "invalid num";
		System.out.println(msg);
		
			
		
		
		
		
		/*System.out.print("enter the number1:");
		int n2=s.nextInt();
		System.out.print("enter the number1:");
		int n3=s.nextInt();
		
		int d= (n1>n2&&n1>n3)?(n2>n3?n2:n3):n2>n1&& n2>n3?n1>n3?n1:n3:n1>n2?n1:n2;
		System.out.println(d);
		
		
		
		//int n=n3>(n1>n2)
		/*if(n1>n2)
		{
			if(n1>n3)
			{
				System.out.println("n1 is grater");
				
			}
		}
		int a,b,c,d;*/
		//int ans=5+(c++*2)- --c+c++-x--+x++/4;
		//System.out.println(ans);
		
		
			//String msg=x>y?x+"is bigger" : y+"is bigger";
			//System.out.println(msg);
			
			
		//	String msg1=x<y?x+"is minimum" :y+"is minimum";
			//System.out.println(msg1);
		
			
			
			
		
		
		
	}

}
