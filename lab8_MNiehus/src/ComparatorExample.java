import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparatorExample {
	public static void main(String[] args) 
	{
		// Create list of employees
		List<Employee> employees = new LinkedList<>();
		
		// Put employees in list
		employees.add(new Employee("Boggs", "Kay", 716533892, 12.57));
		employees.add(new Employee("Lyton", "Ben", 476227851, 77.88));
		employees.add(new Employee("Boggs", "Amy", 553572246, 22.32));
		employees.add(new Employee("Dern", "Donald", 243558673, 23.44));
		System.out.println("Original List");
		printList(employees);
		
		// Create comparator
		EmployeeSSNComparator ssnComp = new EmployeeSSNComparator(); 
		// Sort list based on SSN
		Collections.sort(employees, ssnComp);
		System.out.println("\nSorted on SSN");
		printList(employees);

		EmployeeNameComparator nameComp = new EmployeeNameComparator();
		Collections.sort(employees, nameComp);
		System.out.println("\nSorted on Name");
		printList(employees);
		
		// Stage 1
		EmployeeSalaryComparator salComp = new EmployeeSalaryComparator();
		Collections.sort(employees, salComp);
		System.out.println("\nSorted on Salary");
		printList(employees);
		
		// Stage 2
		// Get employee with largest and smallest SSN
		Employee eMax = Collections.max(employees, ssnComp);
		Employee eMin = Collections.min(employees, ssnComp);
		System.out.println("\nEmployee with largest SSN: " + eMax);
		System.out.println("Employee with smallest SSN: " + eMin);

		// Must be sorted on SSN for binarySearch to work (for finding matching SSN)
		Collections.sort(employees, ssnComp);
		System.out.println("Current List");
		printList(employees);
		Employee eKey = new Employee(243558673);
		// Search for employee that matches "eKey"
		int pos = Collections.binarySearch(employees, eKey, ssnComp);
		// Get employee that was found. This is of course hard-coded and the
		// employee does exist. In general, when pos>=0, then key was found,
		// so, pos<0 would mean the employee was not found.
		Employee e = employees.get(pos);
		System.out.println("\nEmployee Key searched for: " + eKey);
		System.out.println("Employee found: " + e);
		
		// Sort list in reverse order according to the SSN comparator
		Collections.sort(employees, Collections.reverseOrder(ssnComp));
		System.out.println("\nSorted on SSN reversed");
		printList(employees);

	}
	
	private static void printList(List<Employee> emps) {
		for(Employee e : emps) {
			System.out.println("   " + e);
		}
	}

}
