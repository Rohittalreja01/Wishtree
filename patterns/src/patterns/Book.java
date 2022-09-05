package patterns;

import java.util.Scanner;

public class Book {
 
	
	
	      int b_id;
	      String b_name;
	      String a_Name;
	      int price;
	      int rating;
	      
	      void accept()
	      {
	    	  Scanner sc=new Scanner(System.in);
	    	  System.out.println("enter id:");
	    	  b_id=sc.nextInt();
	    	  System.out.println("enter name:");
	    	  b_name=sc.next();
	    	  System.out.println("enter name:");
	    	  a_Name=sc.next();
	    	  System.out.println("enter price:");
	    	  price=sc.nextInt();
	      }
	      
	      void giveRating()
	      {    Scanner sc=new Scanner(System.in);
	          
	    	  rating=sc.nextInt();
	    	  if(rating==5)
	    	  {
	    		  System.err.println("excellent");
	    	  } else if(rating==4)
	    	  {
	    		  System.out.println("good");
	    	  }
	    	  else if(rating==3){
	    		  System.out.println("bad");
	    	  }else if(rating==2)
	    	  {
	    		  System.out.println("bad");
	    	  }
	      }
	      
	      void displayDetails()
	      { System.out.println("details of book are:");
	    	  System.out.println(this.price);
       	   System.out.println(this.a_Name);
       	   System.out.println(this.b_id);
	      }
	          /* Book()
	           {
	        	   this.accept();
	        	   this.displayDetails();
	           }*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk=new Book();
		bk.accept();
		bk.displayDetails();
		bk.giveRating();
		

	}

}
