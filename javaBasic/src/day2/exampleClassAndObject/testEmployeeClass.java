package day2.exampleClassAndObject;

public class testEmployeeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		employee alex = new employee();
		employee linda = new employee();
		
		alex.salary = 20000;
		alex.bonus = 10000;
		double t1 = alex.calculateTotalPay();
		System.out.println("Alex "+t1);
		
		linda.salary = 25000;
		linda.bonus = 15000;
		double t2 = linda.calculateTotalPay();
		System.out.println("Linda "+t2);
		
		
	}

}
