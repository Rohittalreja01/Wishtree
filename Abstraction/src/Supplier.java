
public abstract class Supplier {
	 static int id;
	int price;
	protected static String name;
	
	public Supplier(int id, int price, String name) {
		this.id = id;
		this.price = price;
		this.setName(name);
	}
	abstract void display();
	final void Display()
	{
		System.out.print("supplier class");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
	class Buyer extends Supplier
	{
		public Buyer(int i, int j, String string) {
		   super(id, id, name);
		   
		}
		void display()
		{
			System.out.println(id);
			System.out.println(price);
			
			
		
	}
		public static void main(String args[])
		{
			Supplier s;
			s=new Buyer(112 ,11,"asc");
			s.display();s.Display();
			
			
		}
	}
	


