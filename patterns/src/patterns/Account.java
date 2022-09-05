package patterns;

public class Account
{
	
	long accountNo;
	String customerName;
	
Account(long accountnum,String name)
{
	accountNo=accountnum;
	customerName=name;
	System.out.println("i am  constructor");
	System.out.println("account number is:"+accountNo);
	System.out.println("name is :"+customerName);
}
void display()
{
	System.out.println("account number is:"+accountNo);
	System.out.println("name is :"+customerName);
}

public static void Main(String args[])
{

	Account ac=new Account(112,"rohit");
	ac.display();
	
	
	
	
	
	
	 
}

}