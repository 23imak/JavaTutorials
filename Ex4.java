package Excercise;

//If you don't call the base class, the compiler will show an error .

class  BaseClass1{
	BaseClass1(int i) {
		System.out.println("BaseClass1 constructor");
	}	
}

class BaseClass2 extends BaseClass1 {
	BaseClass2(int i) {
		
		super(i); // else: "cannot find symbol: constructor BaseClass1()
		System.out.println("BaseClass2 constructor");
	}
}

public class Ex4 extends BaseClass2 {
	Ex4() {
		super(11);
		System.out.println("Ex4 constructor");
	}
	public static void main(String[] args) {
		Ex4 x = new Ex4();
	}
}
