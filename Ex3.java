package Excercise;

//base class constructors are always called and  called before derived class constructors.


class A1 {
	A1() {
		System.out.println("A()");
	}
}

class B1 extends A1 {
	B1() {
		System.out.println("B()");
	}
}

class C1 extends B1 {
	C1() {
		System.out.println("C()");
	}
}

class D1 extends C1 {
	D1() {
		System.out.println("D()");
	}

	public static D1 makeD() {
		return new D1();
	}

	public static void main(String[] args) {
		D1 d = new D1();
		D1 d2 = makeD();
	}
}

public class Ex3 extends D1 {
	Ex3() {
		System.out.println("E()");
	}

	public static void main(String[] args) {
		Ex3 e = new Ex3();
		D1.main(args);
	}
}