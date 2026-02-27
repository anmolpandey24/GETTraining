package com.coforge.project4.DayPROJECT;

public class CalculatorApp {

//	@Override
//	public void add(int a, int b) {
//		System.out.println("Sum : "+(a+b));
//		
//	}
//	
	public static void main(String[] args) {
		
		//passing parameters to the lambda and no return
//		CalculatorInterface ca=(a,b)->System.out.println("Sum : "+(a+b));
//	 // lamda expression
//			
//		
//		ca.add(34, 98);
		
		//passing parameters and having return type
//		CalculatorInterface ca=(a,b)->a-b;
//		System.out.println(ca.sub(56, 23));
		
//		CalculatorInterface ca=()->{
//			int a=6,b=9;
//			return a*b;
//		};
//		
//		System.out.println("Result is:"+ca.mul());
		// no parameters no return
		CalculatorInterface ca=()->{
			float a=72,b=8;
			System.out.println("Result is:"+a/b);
		};
		ca.div();
	}

}
