package org.stu;

public class Circle implements Drawable {


      public void empName() {
			System.out.println("Krishna");
		}
		
        @Override
		public void area() {

           System.out.println("Area name is Chennai");			
		}

		@Override
		public void volume() {
        System.out.println("The volume is V");			
		}
		
		public static void main(String[] args) {
			
			Circle c = new Circle();
			c.empName();
			c.area();
			c.volume();
			
		}
		


}
