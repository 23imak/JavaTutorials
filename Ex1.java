package Excercise;



class Engine {
	private String s;
	Engine() {
		System.out.println("Inside Engine()");
		s = "V8";
	}
	public String toString() { return s; }
}

public class Ex1 {
	private String name, year, color;
	private Engine e;
	public Ex1() {
		System.out.println("Inside Mustang()");
		name = "Ford";
		year = "1976";
		color= "Black";				
	}
	public String toString() { 
		e = new Engine();
		return "Name = " + name + ", " +
			"Year = " + year + ", " +
			"Color = " + color + ", " +
			"Engine = " + e;
	}
	public static void main(String[] args) {
		Ex1 e1 = new Ex1();
		System.out.println(e1);
	}
}
