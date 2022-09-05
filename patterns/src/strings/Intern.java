package strings;

public class Intern {

	public static void main(String[] args) {
		
		
		String s="hello";
		
		String s1=new String("hello");
		
		
		//  s1=s.intern();
		
		 if(s==s1)
		 {
			 System.out.println("Equal");
	
		 }
		 else
			 System.out.println("not equal");
		 
		
	}

}
