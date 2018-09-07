package day1.example;

public class ExampleIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Relational Operator
		 * 
		 * Is equal to           ==
		 * Is not equal to       !=
		 * Is grater than        >
		 * Is less than          <
		 * Greater than or equal to >=
		 * Less than or equal to    <=
		 * 
		 */

		int x = 20;
		int y = 20;
		
		if(x>y) {
			
			System.out.println("x is greater than y");
		}else if(x==y) {
			System.out.println("x is equal to y");
		}else{
			
			System.out.println("x is less than y");
		}
	}

}
