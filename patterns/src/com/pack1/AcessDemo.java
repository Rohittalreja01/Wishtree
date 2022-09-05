package com.pack1;

public class AcessDemo {

	private int i = 10;
	int b = 20;
	protected int c = 30;
	public int a = 11;

}

class A {

	void display() {
		AcessDemo as = new AcessDemo();

		// System.out.println(as.i);
		System.out.println(as.b);
		System.out.println(as.c);
		System.out.println(as.a);
	}
}
class B extends AcessDemo{
	void display() {
		// System.out.println(i);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
	
}
}
