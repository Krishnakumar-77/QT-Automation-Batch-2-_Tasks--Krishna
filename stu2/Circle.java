package org.stu2;

public class Circle extends Shape {
	

	@Override
	public void calculareArea() {
    System.out.println("The CALCULATE AREA");		
	}
	
	public static void main(String[] args) {
		
		
		Circle c = new Circle();
		c.calculareArea();
		c.stuName();
		
	}


}
