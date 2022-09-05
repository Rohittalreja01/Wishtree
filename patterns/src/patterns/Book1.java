 package patterns;

public class Book1 {
	
	private String bookName;
	private int bookPrice;
	private String authorName;
	
	public void setBookname(String bookName)
	{
		this.bookName=bookName;
	
		
	}
	public String getbookname()
	{
		return bookName;
	}

	public void setauthorName(String authorName)
	{
		this.authorName=authorName;
	
		
	}
	public String getauthorName()
	{
		return authorName;
	}
	public void setbookPrice(int bookPrice)
	{
		this.bookPrice=bookPrice;
	
		
	}
	public int getbookPrice()
	{
		return bookPrice;
	}
	public static void main(String args[])
	{
		Book1 bk=new Book1();
		bk.setauthorName("rohit");
		bk.setBookname("abds");
		bk.setbookPrice(112);
		
		System.out.println(bk.getauthorName());
		System.out.println(bk.getbookname());
		System.out.println(bk.getbookPrice());
		
	}

}
