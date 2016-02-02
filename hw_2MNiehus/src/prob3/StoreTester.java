//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 1
//Due Date: 1/27/16
//************************
package prob3;

public class StoreTester {
	
	public static void main(String[] args) {
		Store store = new Store();
		Employee e = new Employee("Dave");
		for(int i=1; i<6; i++) e.setHours(i, 8);
		store.addEmp(e);
		e = new Employee("Anna");
		e.setHours(6, 10);
		store.addEmp(e);
		e = new Employee("Paul");
		store.addEmp(e);
		System.out.println (store);
		System.out.println (store.getEmp(1));
		}

}
