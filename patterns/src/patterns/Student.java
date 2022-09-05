package patterns;

public class Student {

	
	int id=12;
	String name="rohit";
	
	void displayData(int id,String n)
	{
		this.id=id;
		name=n;
		System.out.println("id is:- "+id);
		System.out.println("name is:"+n);
		System.out.println(getId(id));                             ////
	}
	    public int  getId(int id)
	    {
	    	return id;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student();
	    
		s.displayData(11," mohit");
		
	
		
	}

}
