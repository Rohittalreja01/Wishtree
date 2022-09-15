package inheritance;

public class Containment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b=new Bank();
		b.setId(12);
		b.setName("icici");
		Details d=new Details();
		b.setDetails(d);
		b.getDetails().setempName("rohit");
		b.getDetails().setsalary(30000.0f);
		//b.getDetails().getsalary();
		
		
		
		System.out.println("bank is "+b.getName());
		System.out.println("employee is:"+b.getDetails().getempName());
		System.out.println("employee id:"+b.getId());
		System.out.println("salary is:"+b.getDetails().getsalary());
		


	}

}
