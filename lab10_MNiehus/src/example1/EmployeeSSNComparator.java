package example1;

import java.util.Comparator;

public class EmployeeSSNComparator implements Comparator<Employee> {
	public int compare( Employee e1, Employee e2 ) {
		return e1.getSSNum() - e2.getSSNum();
	}
}