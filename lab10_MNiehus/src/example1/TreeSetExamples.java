package example1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExamples {

	public static void main(String[] args) {
 		//treeSetExample();
 		treeSetExample2();
	}
		
	public static void treeSetExample() {
		// Step 1
		String[] aryCities = {"New York", "Atlanta", "Savannah", "Tampa", "Durango", "Atlanta"};
		
		System.out.println( "TreeSet Examples" );
		System.out.println( "---------------" );
		// Create a tree set
		TreeSet<String> tsCities = new TreeSet<String>();

		// Several ways to add cities from Array:
		// a. Use addAll method.
		tsCities.addAll( Arrays.asList(aryCities) );
		tsCities.clear();
		
		// b. Use Collection's add method to add to TreeSet
		System.out.print("Adding cities to TreeSet:\n   ");
		for(String city : aryCities) {
			System.out.print(city + ", ");
			tsCities.add(city);
		}
		System.out.println();
		
		// c. Use TreeSet's constructor
		tsCities = new TreeSet<>( Arrays.asList(aryCities) );
		// Access items in a for loop
		System.out.print("Access items with for loop:\n   ");
		for(String city : tsCities) {
			System.out.print(city + ", ");
		}
		System.out.println();

		
		System.out.println("\nfirst(): " + tsCities.first());
		System.out.println("last(): " + tsCities.last());
		SortedSet<String> ssHead = tsCities.headSet("New York");
		System.out.println("headSet(\"New York\"): " + ssHead);
		SortedSet<String> ssTail = tsCities.tailSet("New York");
		System.out.println("tailSet(\"New York\"): " + ssTail);
		System.out.println("tailSet(\"New Amsterdam\"): " + tsCities.tailSet("New Amsterdam"));
		System.out.println("tailSet(\"New Zealand\"): " + tsCities.tailSet("New Zealand"));
		System.out.println("subSet(\"Chicago\", \"Pittsburg\"): " + tsCities.subSet("Chicago",
		"Pittsburg"));
		System.out.println("subSet(\"London\", \"New York\"): " + tsCities.subSet("London", "NewYork"));

		System.out.println("\nThe TreeSet: " + tsCities);
		System.out.println("lower(\"Pittsburg\"): " + tsCities.lower("Pittsburg"));
		System.out.println("lower(\"New York\"): " + tsCities.lower("New York"));
		System.out.println("higher(\"Moab\"): " + tsCities.higher("Moab"));
		System.out.println("higher(\"New York\"): " + tsCities.higher("New York"));
		System.out.println("\nThe TreeSet: " + tsCities);
		System.out.println("floor(\"Pittsburg\"): " + tsCities.floor("Pittsburg"));
		System.out.println("floor(\"New York\"): " + tsCities.floor("New York"));
		System.out.println("ceiling(\"Moab\"): " + tsCities.ceiling("Moab"));
		System.out.println("ceiling(\"New York\"): " + tsCities.ceiling("New York"));
		System.out.println("\nThe TreeSet: " + tsCities);
		System.out.println("pollFirst(): " + tsCities.pollFirst());
		System.out.println("pollLast(): " + tsCities.pollLast());
		System.out.println("New tree set: " + tsCities);

	}
	
	private static void treeSetExample2() {
		// Create employees
		Employee e1 = new Employee("Boggs", "Kay", 716533892, 12.57);
		Employee e2 = new Employee("Lyton", "Ben", 476227851, 77.88);
		Employee e3 = new Employee("Boggs", "Amy", 553572246, 22.32);
		Employee e4 = new Employee("Dern", "Donald", 243558673, 23.44);

		// TreeSet ordered on Name.
		TreeSet<Employee> tsEmpsName = new TreeSet<>( new EmployeeNameComparator() );
		tsEmpsName.add(e1); tsEmpsName.add(e2); tsEmpsName.add(e3); tsEmpsName.add(e4);  
		System.out.println("\nSorted on name");
		printSet(tsEmpsName);
		
		// TreeSet ordered on SSN.
		TreeSet<Employee> tsEmpsSSN = new TreeSet<>( new EmployeeSSNComparator() );
		tsEmpsSSN.addAll(tsEmpsName);
		System.out.println("Sorted on SSN");
		printSet(tsEmpsSSN);
		
		// TreeSet ordered on Salary.
		TreeSet<Employee> tsEmpsSalary = new TreeSet<>( new EmployeeSalaryComparator() );
		tsEmpsSalary.addAll(tsEmpsName);
		System.out.println("Sorted on salary");
		printSet(tsEmpsSalary);
		
		Employee empKey = new Employee(23.0);
		SortedSet<Employee> ssHighSalaries = tsEmpsSalary.tailSet(empKey);
		System.out.println("\nEmployees larger than: " + empKey);
		printSet(ssHighSalaries);
		
	}

	private static void printSet(Set<Employee> emps) {
		for(Employee e : emps) {
			System.out.println("   " + e);
		}
	}
	
}
