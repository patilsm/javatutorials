package day1.example;

public class ExampleTwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = new int [4][4];
		
		/*a[0][0] = 2;
		a[0][1] = 2;
		a[0][2] = 2;
		a[1][0] = 2;*/
		int temp = 10;
		for(int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				a[i][j] = temp;
				temp+=4;
			}
		}
		for(int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(a[i][j] + "  ");
				}
			System.out.println();
		}
		System.out.println(a[0][3]);
	}

}
