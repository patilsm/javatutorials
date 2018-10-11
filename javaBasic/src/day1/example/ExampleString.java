package day1.example;

public class ExampleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello World";
		
		System.out.println(s.substring(2));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		
		String r = "24";
		
		//Wrapper class
		
		int a = Integer.parseInt(r)/2;
		System.out.println("Results =" +a);
		
		System.out.println(r);

	}

}
