import java.util.Scanner;


public class Temprature {
	 public static void main(String[] args){
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the temperature in Celsius : ");
	        float c = sc.nextFloat();
	        
	        // Converting Celsius to Fahrenheit
	        float f = c * (9.0f/5.0f) + 32;
	        
	        System.out.println("The temperature is "+f+" degree Fahrenheit.");
	        
	    }

}
