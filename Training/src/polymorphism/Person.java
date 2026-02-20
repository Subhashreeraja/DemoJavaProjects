package polymorphism;

public class Person {
	String name;
	String address;

	Person(String name, String address) {
		name = "Subha";
		address = "205/5,Ariyur street,Pnp";
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
}

class Student extends Person {
	String program;
	int year;
	double fee;

	Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	public String getProgram() {
		return program;
	}

	public int getYear() {
		return year;
	}

	public double getFee() {
		return fee;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [program=" + program + ", year=" + year + ", fee=" + fee + "]";
	}

}

class Staff extends Person {
	String school;
	Double pay;

	public Staff(String name, String address, String school, Double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public Double getPay() {
		return pay;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public void setPay(Double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Staff [school=" + school + ", pay=" + pay + "]";
	}

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff m=new Staff("Myl","Add","SSV",100.0);
		System.out.println(m);

	    Student s = new Student("John","Chennai","ECE",2024,50000);
	    System.out.println(s);
		

	}
