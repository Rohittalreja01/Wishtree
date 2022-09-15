package inheritance;

public class IPLteam {
	
	 void play()
	{
		System.out.println("hello");
	}
	 
	 class CSK extends IPLteam
	 {
		 void play()
		 {
			 System.out.println("hello csk");
		 }
		 
	 }
	 class RCB extends IPLteam
	 {
		 void play()
		 {
			 System.out.println("hello rcb");
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

}
