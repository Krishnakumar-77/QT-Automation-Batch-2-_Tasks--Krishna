package org.stu;

public class Square implements Drawable {


       public void empId() {
			System.out.println("7712");
		}

	@Override
	public void area() {
System.out.println("The AREA");		
	}

	@Override
	public void volume() {
System.out.println("THE VOLUME");		
	}
	
	public static void main(String[] args) {
		  
 	   Square s = new Square();
 	   s.empId();
 	   s.area();
 	   s.volume();
 	   
	}
	
	

}
