package patterns;

public class Movie1 {

	private String movieName;
	private int ticketCost;
	private String movieCategory;
	
	public void setmovieName(String movieName)
	{
		this.movieName=movieName;
	
		
	}
	public String getmovieName()
	{
		return movieName;
	}

	public void setmovieCategory(String movieCategory)
	{
		this.movieCategory=movieCategory;
	
		
	}
	public String getmovieCategory()
	{
		return movieCategory;
	}
	public void setticketCost(int ticketCost)
	{
		this.ticketCost=ticketCost;
	
		
	}
	public int getticketCost()
	{
		return ticketCost;
	}
	public static void main(String args[])
	{
		Movie1 bk=new Movie1();
		bk.setmovieName("RRR");
		bk.setmovieCategory("action");
		bk.setticketCost(250);
		
		System.out.println(bk.getmovieName());
		System.out.println(bk.getmovieCategory());
		System.out.println(bk.getticketCost());
		
	}

}
