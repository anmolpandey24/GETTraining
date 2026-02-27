package com.coforge.project4.DayPROJECT;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoOnBuiltInFI {
	public static void main(String[] args) {
		//supplier
		Supplier<String> strSupplier=()->"Hello World".toUpperCase();
		
		System.out.println(strSupplier.get());
		
		
		Supplier<Double> randomSupplier=()->{
			double randomValue=Math.random();
			return randomValue;
		};
		
		System.out.println(randomSupplier.get());
		
		Supplier<Integer> otpSupplier=()->{
			Integer otp=(int)(Math.random()*10000);
			return otp;
		};
		
		System.out.println(otpSupplier.get());
		
		//consumer
		Consumer<String> strConsumer=(str1)->System.out.println(str1.toUppercase());
		strConsumer.accept("anmol");
		
		Consumer<Integer> squareConsumer=(num)->System.out.println(num*num);
		for(int i=1;i<=10;i++)
			squareConsumer.accept(i);
		
		Consumer<integer> factorialConsumer=(num)->{
			int fact=1;
			for(int i=1;i<=10;i++)
				fact=fact*i;
			System.out.println(fact);
			
		};
		
		factorialConsumer.accept(5);
		
		//function
		
		Function<Integer,Boolean> isEvenOrOdd=(num)->{
			if(num%2==0)
				return "even";
			else
				return "odd";
		};
		
		System.out.println(isEvenOrOdd.apply(54));
		
		Function<String,String>greet(name)->"Hello "+name;
		
		System.out.println(greet.apply("Anmol"));
		
		
		//predicate
		
		Predicate<Integer> checkNum=(num)->num%2==0;
		if(checkNum.test(567))
			System.out.println("Even num");
		else
			System.out.println("Odd num");
		
		Predicate<String> chkLength=(str)->str.Length()>5;
		System.out.println(chkLength.test("Anmol"));
		
		Predicate<String> authenticateUsername=(uname)->uname.equals("Anmol);
		Predicate<String> authenticatePassword=(pwd)->pwd.equals("Anmol123");
		String result=authenticateUsername.test("Anmol")&&authenticatePassword.test("Anmol123")?"Authenticated successful ":"Invalid Credentials";
	    System.out.println(result);
	
	   //username validation
	    // length must be more than 3 chars
	    // it cannot be null
	    //it cannot be blank
	    Predicate<String> validateUsername=(uname)->
	    uname.length()>3&&uname!=null&&!uname.isBlank();
	    
	    System.out.println(validateUsername.test("   A"));g
	}
	

}
