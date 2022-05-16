//==========
//Assignment #1: ( Class and Methods)
//===========
//--  Create a class "Calculator" with below methods
//	(a) add(int num1, int num2, int num3), it should return sum of num1+num2+num3
//	(b) sub(int num1, int num2), it should return subtraction of of num1-num2
//	(c) mul(double num1, double num2), it should return product of num1 * num2
//	(d) divide(float num1, float num2), it should return division of num1 / num2
//
//-- Create another class as MyCalculator and call all the methods from Calculator and print the results

package assignment1;

public class Calculator {
	public void add() {
		int num1=5,num2=6,num3=7;
		int a=num1+num2+num3;
		System.out.println("Added Value=" +a);
	}
	public void sub() {
		int num1=5,num2=6;
		int b=num1-num2;
		System.out.println("Sub Value=" +b);
	}
	public void mul() {
		double num1=5.5,num2=6.5;
		double c=num1*num2;
		System.out.println("Multiplied Value=" +c);
	}
	public void div() {
		float num1=4.4f,num2=2.2f;
		float c=num1/num2;
		System.out.println("Multiplied Value=" +c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj1=new Calculator();
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.div();
	}

}
