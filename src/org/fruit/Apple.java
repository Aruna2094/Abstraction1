package org.fruit;

public class Apple extends Fruits {
	@Override
	public void grapes() {
		for(int i=1;i<101;i++) {
			if(i%5==0) {
				System.out.println(i);
			}
			}		
	}

	@Override
	public void gova() {
		System.out.println("print gova");
	}
	
    private void musambi() {
		System.out.println("print musambi");
	}
    public static void main(String[] args) {
    	Apple a=new Apple();
    	a.grapes();
    	a.gova();
    	a.orange();
    	a.musambi();
    	
    	//upcasting
    	Fruits f=new Apple();
    	f.grapes();
    	f.orange();f.gova();
	}
}
