package polymorphism;

public class Vehicle {
	void run() {
		System.out.println("vehicle is running");
}
}
	class Truck extends Vehicle{
		void run() {
			System.out.println("truck is running");
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Vehicle();
		v.run();
		
		Truck t=new Truck();
		t.run();

	}

}
