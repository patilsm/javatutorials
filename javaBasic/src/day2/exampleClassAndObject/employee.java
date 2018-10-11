package day2.exampleClassAndObject;

//Class :- template for an Object
// Which contain data and method

//Object :- Copy of a class/Instance of a class.

public class employee {
	
	double salary;
	double bonus;
	
	
	double calculateTotalPay(){
		
		double totalpay = salary+bonus;
		System.out.println("Toatal pay is " +(totalpay));
		return totalpay;
	}
}
