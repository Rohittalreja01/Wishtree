
interface printer
{
	void print();
}
class Employee implements printer
{
    int a=10;
    String name="rohit";
    
	@Override
	public void print() {
		System.out.println(a);
		System.out.println("name is "+name);
		

		
	}
	
}
class Student implements printer
{
	String sname="mohit";
	int rollnum=123;
	public void print()
	{
		System.out.println(rollnum);
		System.out.println("name is "+sname);
	}
}





public class interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printer p;
		p=new Employee();
		p.print();
		p=new Student();
		p.print();
		Cake c;
		c=new BlackForest();
		c.bake();
		c=new Strawberry();
		c.bake();
		

	}

}
