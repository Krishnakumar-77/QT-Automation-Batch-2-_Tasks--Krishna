package org.wed4;

public class Diamond {

	public static void main(String[] args) {
		
    	int i,j,k;
	 
    	int space= 20;

		
		
		for ( i=1; i<=5; i++) {
			
			for(k=1; k<=space; k++) {
				
				System.out.print(" ");
				}
			space--;
			
			for (j=1;j<=i; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
			}
		space=20;
		
		for (i=4;i>=1;i--) {
			
			for(k=4; k<=space; k++) {
				
				System.out.print(" ");
				}
			space++;
			
			for (j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}

}
