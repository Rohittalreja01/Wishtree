package strings;

public class Contain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		boolean b=s.contains("l");
		if(b==true)
		{
			System.out.println("present");
		}
		else
			System.out.println("not present");
		System.out.println(s.endsWith("o"));
		System.out.println(s.endsWith("l"));
		System.out.println(s.startsWith("h"));

	}

}
