package day1.example;

public class ExampleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {12,23,45,23};
		
		System.out.println(a[2]);
		
		int[] b = new int[5];
		
		b[0] = 10;
		b[3] = 5;
		b[4] = 11;
		
		//int temp;
		
		//advance for statement
		System.out.println("----------------");
		for (int temp:a) {
			System.out.println(temp);
		}
		System.out.println("-----------------");

		for(int temp1:b) {
			System.out.print(temp1 + " ,");
		}
	}

}
