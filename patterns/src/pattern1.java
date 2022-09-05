
public class pattern1 {

	public static void main(String[] args) {
		System.out.println("prime from 400 to 300:");
		int a=400;
		int b=300;
		while(a>b)
		{
			int flag=0;
			for (int j=2;j<=b/2;j++)
			{
				if(a%j==0)
				{
					flag=1;
					break;
				}
			}
			if (flag==0)
				System.out.println(a+" ");
			a--;
		}
	}
}
