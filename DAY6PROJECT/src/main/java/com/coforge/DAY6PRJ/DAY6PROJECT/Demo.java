package com.coforge.DAY6PRJ.DAY6PROJECT;

public class Demo {
	public static void calculate() {
	int a=5,b=0;
	if(b==0)
		throw new ArithmeticException();
	else
		System.out.println(a/b);
	}
	
	public static void checkAge(int age) throws AgeNotSufficientException {
		if(age>15)
			System.out.println("eligible to register plus two");
		else
			throw new AgeNotSufficientException();
	}

	public static void main(String[] args) throws AgeNotSufficientException  {
		try {
		calculate();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		checkAge(17);
		
		
		System.out.println("Application completed");
		

	}
	

}
