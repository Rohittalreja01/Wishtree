package patterns;

public class Game {

	String gameName;
	String state;
	String county;
	
	 Game()
	{    
		System.out.println("default");
		 
		
	}
	 Game(String gameName,String state)
	 {    
		 this.gameName=gameName;
		 this.state=state;
		 System.out.println("parameter constructor");
		 
	 }
	 void display()
	 {
		 System.out.println("game name"+gameName);
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g=new Game();
	    g.display();
		

	}

}
