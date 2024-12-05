package javaInheritance2;

public class Main {

	public static void main(String[] args) {
		Adder adder = new Adder();
		
		System.out.println("My superclass is: Arithmetic");
		
		System.out.println(adder.add(20, 22) + " " + adder.add(7, 6) + " " + adder.add(10, 10));
	}

}
