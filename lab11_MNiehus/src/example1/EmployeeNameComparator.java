package example1;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
	public int compare( Employee e1, Employee e2 ) {
		int diff = e1.getLastName().compareTo(e2.getLastName());

		if( diff != 0 )
			return diff;
		else
			return e1.getFirstName().compareTo(e2.getFirstName());
	}
}
