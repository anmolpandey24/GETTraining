package com.coforge.project3;

import java.util.Scanner;

public class ShapesMainClass {
	
	public static void main(String[] args) {
		Shape sh;
		String type;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter shape type Circle/Square");
		type=sc.next();
		
		if(type.equals("Circle")) {
			System.out.println("enter radius");
			double r=sc.nextDouble();
			sh=new Circle(r);
			sh.area();
			sh.cirm();
			
		}
		
		else if(type.equals("Square")) {
			System.out.println("Enter side");
			double s=sc.nextDouble();
			sh=new Square(s);
			sh.area();
			sh.cirm();
		}
				
		
//		Circle c=new Circle(7);
//		c.area();
//		c.cirm();
//		
//		
//		Square s=new Square(5);
//		s.area();
//		s.cirm();
	}
	
//	    Shape sh=new Circle(6);
//	    sh.area();
//	    sh.cirm();
//	
//	    sh=new Square(4);
//	    sh.area();
//	    sh.cirm();

}
