package inheritance;

public class Laptop {

	  private int noofUSBport,processorSpeed;
	  
	  
	public int getNoofUSBport() {
		return noofUSBport;
	}


	public void setNoofUSBport(int noofUSBport) {
		this.noofUSBport = noofUSBport;
	}


	public int getProcessorSpeed() {
		return processorSpeed;
	}


	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l=new Laptop();
		l.setNoofUSBport(12);
		l.setProcessorSpeed(100);
		System.out.println(l.getProcessorSpeed());
		System.out.println(l.getProcessorSpeed());

	}

}

