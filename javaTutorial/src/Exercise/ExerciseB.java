package Exercise;

public class ExerciseB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a = {"10" , "12" , "20" , "40"};
		
		int total = 0;
		
		for(String temp:a) {
			
			total = total + Integer.parseInt(temp);
			//System.out.println(total);
		
		}
 System.out.println("Total is " +total);
	}

}
