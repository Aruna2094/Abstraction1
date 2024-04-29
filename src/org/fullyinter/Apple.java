package org.fullyinter;

public class Apple implements Fruits {

	@Override
	public void grapes() {
		System.out.println("print grapes");
		
	}

	@Override
	public void orange() {
		System.out.println("print orange");
		
	}

	@Override
	public void gova() {
	System.out.println("print gova");
		
	}
	private void mango() {
	System.out.println("print mango");

	}
	public static void main(String[] args) {
		Apple a=new Apple();
		a.grapes();
		a.orange();
		a.mango();
		a.gova();
		//upcasting
		Fruits f=new Apple();
		f.grapes();
		f.orange();f.gova();
	}

}
