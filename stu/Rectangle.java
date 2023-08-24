package org.stu;

public class Rectangle implements Drawable {
	
	public void phNo() {
		System.out.println("1234567890");
	}

	@Override
	public void area() {
System.out.println("Area");		
	}

	@Override
	public void volume() {
System.out.println("Volume");		
	}
	
	public static void main(String[] args) {
    
		Rectangle r = new Rectangle();
		r.phNo();
		r.area();
		r.volume();
	}

}
