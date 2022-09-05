package patterns;

import java.util.Scanner;

public class Person {

	
	int id=200;
	String name="ravi";
	int age;
	int weight;
	 void checkAge()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter age");
			int age=sc.nextInt();
			System.out.println("enter weight");
			int weight =sc.nextInt();
		 
		 if(age>18 && weight>50)
		 {
			 System.out.print("person is eligible");
			 
			 
		 }
		 else
			 System.out.println("person is not eligible");
	 }
	 void display()
	 {
		 System.out.println("id is"+id);
		 System.out.println("name is"+name);
		
	 }
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Person p=new Person();
		p.checkAge();
		p.display();
		

	}

}
