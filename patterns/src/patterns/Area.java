package patterns;

public class Area {
	
	int l,b,s;
	
	void area(int s)
	{
		int ar=s*s;
		System.out.println("area square:- "+ar);
		
	}
	void area(int l,int b)
	{
		int ar=l*b;
		System.out.println("Area rectangle:- "+ar);
		
	}

	public static void main(String[] args)
	{

		Area ar=new Area();
		ar.area(22);
		
		ar.area(12, 12);
		

	}

}
