package org.wedd;

import org.wed.School;

public class Student extends School {

		public void stuName() {
			
			System.out.println("STUNAME");
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
		
public static void main(String[] args) {
			
			Student s = new Student();
			s.stuName();
			s.name();
			s.history();
			s.Branch();
}
}
