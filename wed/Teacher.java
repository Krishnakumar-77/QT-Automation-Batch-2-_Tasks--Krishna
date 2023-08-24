package org.wed;

public class Teacher extends School {
	
	public void techName() {
		System.out.println("TECHNAME");
	}

	@Override
	public void name() {
		System.out.println("SBK");
		
	}

	@Override
	public void history() {
		System.out.println("25Years");
		
	}

	@Override
	public void Branch() {
    	System.out.println("APK");
		
	}

	@Override
	public void fees() {
		
    	System.out.println("10k");

		
	}
	
public static void main(String[] args) {
		
		Teacher t = new Teacher();
		t.techName();
		t.name();
		t.history();
		t.Branch();
		t.fees();
		
    }
}
