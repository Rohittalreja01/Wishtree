package inheritance;

class Parent1
{
	int i;
	Parent1(int i)
	{
		this.i=i;
	}
	void display()
	{
		System.out.println(i);
	}
}
class Child extends Parent1
{
	int i;
	Child(int i)
	{
		super(34);
		this.i=i;
	}
	void display()
	{
		super.display();
		System.out.println(i);
		
	}
}
class Child2 extends Parent1
{
	int i;
	Child2(int i)
	{
	super(40);
	this.i=i;
	}
	void display()
	{
		super.display();
		System.out.println(i);
	}
}
public class Parentchild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c=new Child2(19);
		c.display();

	}

}
