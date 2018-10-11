package Exercise;

public class ExerciseA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salary = 20000;
		double tax = 0.0;
		
		if(salary <= 15000) {
			System.out.println("Total tax is " +salary* 0.10);
		
		}else if(salary <= 40000){
			System.out.println("Total tax is " +salary* 0.20);
		}else {
			System.out.println("Total tax is " +salary*0.30);
		}
		System.out.println("total Tax" +tax);

	}

}
