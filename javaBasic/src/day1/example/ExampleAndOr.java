package day1.example;

public class ExampleAndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = -10;
		int y = -10;
		
		if(x>0 && y >0) {
			System.out.println("Both numbers are positive");
		}else if(x>0 || y>0) {
			System.out.println("Atleast one number is positive");
		}else {
			System.out.println("both numbers are -ve");
		}

	}

}
