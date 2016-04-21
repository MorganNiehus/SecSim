package example1;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetExamples {

	public static void main(String[] args) throws FileNotFoundException {
 		//hsExamples1();
		//hsExamples2();
  	    hsExamples3();
 		
	}
		
	public static void hsExamples1() {
		
		System.out.println("HashSet Example 1\n-----------------");

		// Create some strings.
		String[] aryCities = {"New York", "Atlanta", "Savannah", "Tampa", "Durango"};
		// Create a hash set
		Set<String> hsCities = new HashSet<String>();
		// Use Collection's add method to add to HashSet
		System.out.print("Adding cities to HashSet:\n   ");
		for(String city : aryCities) {
			System.out.print(city + ", ");
			hsCities.add(city);
		}
		System.out.println();
		
		// Access items in a for loop
		System.out.print("Access items with for loop:\n   ");
		for(String city : hsCities) {
			System.out.print(city + ", ");
		}
		System.out.println();

		// Try to add a duplicate. Note: the Collection's add method
		// returns a boolean indicating if the add was successful.
		boolean isAddSuccessful = hsCities.add(aryCities[1]);
		System.out.println("Successful trying to add " + aryCities[1] + "?\n   " + isAddSuccessful);

		// Why does the code below not compile?
		// Can't iterate with indexed for loop. Set has no get.
		for( int i=0; i<hsCities.size(); i++ ) { 
//			String city = hsCities.get(i);
		}
		
		// Search for an item:
		String srcCity = "Durango";
		boolean isInSet = hsCities.contains(srcCity);
		System.out.print( "Does HashSet contain " + srcCity + "?\n   " + isInSet + "\n");
		srcCity = "Baton Rouge";
		isInSet = hsCities.contains(srcCity);
		System.out.print( "Does HashSet contain " + srcCity + "?\n   " + isInSet + "\n");

		// Remove an item:
		System.out.println("Before remove:\n   " + hsCities);

		String city = "Durango";
		boolean isRemoveSuccessful = hsCities.remove(city);
		System.out.print( "Was remove('" + city + "') successful?\n   " + isRemoveSuccessful + "\n");
		System.out.println("After remove:\n   " + hsCities);
		
		// Create HashSet from array
		HashSet<String> hsCities2 = new HashSet<>(Arrays.asList(aryCities) );		
		
	}
	private static void hsExamples2() {
		System.out.println("\nHashSet Example 2\n-----------------");
		int[] numbers = {3, 6, 2, 6, 2, 8, 9, 14};
		// Declare and create a HashSet to hold integers.
		Set<Integer> nums = new HashSet<Integer>();
		// Add a few values to the set
		for(int number: numbers){
			nums.add(number);
		}
		// Check to see if 14 is in the set and remove it if so
		if(nums.contains(14));{
			nums.remove(14);
		}
		// Loop through the set and display all the values
		System.out.println(nums);
	}

	

	private static void hsExamples3() {
		System.out.println("\nHashSet Example 4\n-----------------");
		
		// Employees are identified by id's which are integers. Below are two sets, one 
		// which contains employees who have completed training module 1 and the other
		// employees who have completed module 2. For the problems below, neither 
		// hsEmps1 nor hsEmps2 should be changed.
		Set<Integer> hsEmps1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
		Set<Integer> hsEmps2 = new HashSet<>(Arrays.asList(1,3,5,6,7,8,9));

		// Write code to create a new set that has the Employees that have completed
		// both training modules.
		Set<Integer> hsTeamsInCommon = new HashSet<>(hsEmps1);
		hsTeamsInCommon.retainAll(hsEmps2);
		System.out.println("Employees who had:\n   " + "module 1: " + hsEmps1 + "\n   " + "module 2: " + hsEmps2);
		System.out.println("Employees who had both:\n   " + hsTeamsInCommon);

		//*** Problem 1:
		
		// Write code to create a new set that has all the employees who have completed either of the two training 
		// modules. For example: {1,2,3} and {1,2,4} would produce {1,2,3,4}. 
		// The new set should be named "hsEmpsBoth".  Uncomment print below when complete.
		//
		// *** Write code here
		//
		System.out.println("\n-->Problem1");
		System.out.println("\nEmployees who had:\n   " + "module 1: " + hsEmps1 + "\n   " + "module 2: " + hsEmps2);
		Set<Integer> hsEmpsBoth = new HashSet<>(hsEmps1);
		hsEmpsBoth.addAll(hsEmps2);
		System.out.println("Employees who had either module:\n   " + hsEmpsBoth);

		
		//*** Problem 2:

		// Write code to create a new set that contains the employees that have only taken the 
		// second training module. For example: {1,2,3} and {1,2,4} would produce {4}
		// The new set should be named "hsOnlyMod2".  Uncomment print below when complete.
		//
		// *** Write code here
		//
		System.out.println("\n-->Problem2");
		System.out.println("\nEmployees who had:\n   " + "module 1: " + hsEmps1 + "\n   " + "module 2: " + hsEmps2);
		Set<Integer> hsOnlyMod2 = new HashSet<>(hsEmps2);
		hsOnlyMod2.removeAll(hsEmps1);
		System.out.println("Employees who had module 2 only:\n   " + hsOnlyMod2);		

		
		//*** Problem 3:
		
		// Write code to create a new set that contains the employees that have had exactly one
		// training module. For example: {1,2,3} and {2,4} produces {1,3,4}
		// The new set should be named "hsExactly1Mod". Uncomment print below when complete.
		//
		// *** Write code here
		//
		System.out.println("\n-->Problem3");
		System.out.println("\nEmployees who had:\n   " + "module 1: " + hsEmps1 + "\n   " + "module 2: " + hsEmps2);
		Set<Integer> hsExactly1Mod = new HashSet<>(hsEmps1);
		hsExactly1Mod.addAll(hsEmps2);
		hsExactly1Mod.retainAll(hsEmps2);
		hsExactly1Mod.removeAll(hsEmps1);
		System.out.println("Employees who had exactly 1 module:\n   " + hsExactly1Mod);		
	}
	
}
