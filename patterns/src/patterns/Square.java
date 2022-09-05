package patterns;

public class Square {
	   
	int s;
	public void calculate()
	{
		int ar=s*s;
		System.out.println("Square is :-"+s*s );
	}
	int calculate(int s)
	{
		
		return s*s;
	}
	void dispaly()
	{
		System.out.println("square is "+s*s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s=new Square();
		s.calculate(4);
		s.calculate();
		s.calculate(4);
		s.dispaly();

	}

}
