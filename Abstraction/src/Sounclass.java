interface Musicalinstrument
{
	void play();
	void listenSound();
	void learnInstrument();
	static void learn()
	{
		System.out.println("static block");
	}
}
	abstract class sound
	{
		abstract void listenSound();
		
	}
class Precusioninstrument extends sound implements Musicalinstrument
{
	public void play()
	{
		System.out.println("play ");
	}

	@Override
	public void listenSound() {
		// TODO Auto-generated method stub
		System.out.println("learn");
		
	}

	@Override
	public void learnInstrument() {
		// TODO Auto-generated method stub
		
	}
}
class Stringedinstrument implements Musicalinstrument
{
	public void play()
	{
		
	}
	public void learnInstrument()
	{
		
	}
	@Override
	public void listenSound() {
		// TODO Auto-generated method stub
		
	}
}



