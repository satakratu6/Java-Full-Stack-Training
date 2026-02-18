package com.capg.lamda;

public class Lamda1 {

	public static void main(String[] args) {
		Person p1=new Person() {

			@Override
			public void cat() {
				System.out.println("Biriyani");
			}
			
		};
		p1.cat();
	}

}
