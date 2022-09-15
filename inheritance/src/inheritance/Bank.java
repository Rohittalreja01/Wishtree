package inheritance;

public class Bank {
	
	private String name;
	   private int em_Id;
	   Details d;
	   
	   public void  setName(String name)
	   {
		   this.name=name;
	   }
	   public void setId(int em_Id)
	   {
		   this.em_Id=em_Id;
	   }
	   public String getName()
	   {
		   return name;
	   }public int getId()
	   {
		   return em_Id;
	   }
	   public void setDetails(Details d)
	   {
		   this.d=d;
	   }
	   public Details getDetails()
	   {
		   return d;
	   }
}
	 
