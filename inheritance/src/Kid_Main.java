
class Kid
{    int pages;
     String authorname;
     
	void readBook(int pages)
	{
		System.out.println("pages "+pages);
	}
	void readBook(int pages,String authorname)
	{
		this.authorname=authorname;
		this.pages=pages;
	}
}
class Bigkid extends Kid
{
	void readBook(int pages)
	{
		System.out.println("pages"+pages);
	}
}
class Tenageer extends Bigkid
{
	void readBook(int pages)
	{
		System.out.println("pages"+pages);
		
	}
}



public class Kid_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Kid k=new Kid();
		//k.readBook(11);
		Bigkid bk=new Bigkid();
		bk.readBook(23);
		Tenageer t=new Tenageer();
		t.readBook(56);

	}

}
