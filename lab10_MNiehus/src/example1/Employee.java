package example1;

public class Employee {
	private String lName = "unknown";
	private String fName = "unknown";
	private int ssNum = 0;
	private double salary = 0.0;
	
	public Employee(String lName, String fName, int ssNum, double salary) {
		this.lName = lName;
		this.fName = fName;
		this.ssNum = ssNum;
		this.salary = salary;
	}	

	public Employee(String lName) {
		this.lName = lName;
	}	

	public Employee(int ssn) {
		this.ssNum = ssn;
	}	

	public Employee(double salary) {
		this.salary = salary;
	}	
	
	public String getLastName() { return lName; }
	public String getFirstName() { return fName; }
	public int getSSNum() { return ssNum; }
	public double getSalary() { return salary; }
	public void setSalary( double salary ) { this.salary = salary; }
	
	public String toString() {
		return String.format("(%s, %s - %d, %.2f)", getLastName(), getFirstName(), getSSNum(), getSalary() );
	}


	
}

