package Excercise;

class A {
	A() {
		System.out.println("A constructor");
	}
}

class B extends A {
	B() {
		System.out.println("B constructor");
	}
}

public class Ex2 extends B {
	public static void main(String[] args) {
		Ex2 x = new Ex2();
	}
}
