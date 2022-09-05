package patterns;

public class Cycle 
{
	int accountNo;
	int noOfWheels;
	
	Cycle()
	{
		System.out.println("default constructor");
		
	}
      Cycle(int accno ,int now)
      {
    	 
    	 this.accountNo=accno;
    	 this.noOfWheels=now;
    	  System.out.println("another constructor");    
      }
      void display()
      {
    	  System.out.println("wheels:"+noOfWheels+"accnum"+accountNo);
      }


      public static void Main(String args[])
      {
    	 
    	  
    	  Cycle c1=new Cycle();
    	  
    	  c1.display();
    	  
    	  
    	  
      }
}

