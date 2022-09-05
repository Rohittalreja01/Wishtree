package patterns;

public class Operation {
	
	int x,y,z;
	
	int add(int x,int y)
	{
		 return (x+y);
	}

	public int sub(int x , int y)
	{
		 return (x-y);
		
	}
	public int mul(int x,int y,int z)
	{
		 return (x*y*z);
	}
	 
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Operation op=new Operation();
		System.out.println(op.add(12, 12));
		System.out.println(op.sub(4,3));
		System.out.println(op.mul(12, 23, 3));
		

	}

}
