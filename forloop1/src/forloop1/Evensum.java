package forloop1;

public class Evensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
				
			}
		}
		System.out.print(sum);

	}

}
