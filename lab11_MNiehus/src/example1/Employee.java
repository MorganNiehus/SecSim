package example1;

public class Employee implements Comparable<Employee> {
	private String lName;
	private String fName;
	private int ssNum;
	private double salary;

	public Employee(String lName, String fName, int ssNum, double salary) {
		this.lName = lName; this.fName = fName; this.ssNum = ssNum;
		this.salary = salary;
	}

	public String getLastName() { return lName; }
	public String getFirstName() { return fName; }
	public int getSSNum() { return ssNum; }
	public double getSalary() { return salary; }
	public void setSalary( double salary ) { this.salary = salary; }

	public String toString() {
		return String.format("%s, %s-%d, %.2f", getLastName(), getFirstName(),
                                                       getSSNum(), getSalary() );
	}

	public boolean equals(Object o) {
		Employee e = (Employee)o;

		int lName = this.getLastName().compareTo(e.getLastName());

		if( lName == 0 ) {
			int fName = this.getFirstName().compareTo(e.getFirstName());
			if( fName == 0 )
				return true;
		}
		return false;
	}

	public int compareTo(Employee e2) {

		int lName = this.getLastName().compareTo(e2.getLastName());

		if( lName != 0 )
			return lName;
		else {
			return this.getFirstName().compareTo(e2.getFirstName());
		}
	}

}
