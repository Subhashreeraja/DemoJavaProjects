package polymorphism;

public class MethodOverloading {
	
	static int add(int a,int b) {
		return a+b;
	}
	static double add(double a,double b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Add int: "+add(1,2));
		System.out.println("Add double: "+add(1.0,2.0));

	}

}
