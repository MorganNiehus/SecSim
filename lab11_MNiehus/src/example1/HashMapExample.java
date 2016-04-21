package example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer,Employee> hmEmployees = new HashMap<Integer,Employee>();

		// Stage 1
		System.out.println("\nStage 1");

		// Create some new employees.
		Employee e1 = new Employee("Lyton", "Xavier", 243558673, 77.88);
		Employee e2 = new Employee("Dern", "Donald", 476227851, 23.44);
		Employee e3 = new Employee("Lyton", "Nelly", 338290448, 82.45);
		Employee e4 = new Employee("Reilly", "Junita", 178890463, 82.45);
		Employee e5 = new Employee("Colter", "Ben", 883456321, 12.89);
		Employee e6 = new Employee("Mixton", "Zerby", 422789012, 22.76);

		// Put emps in hashmap, use SSN as key.
		hmEmployees.put(e1.getSSNum(), e1);
		hmEmployees.put(e2.getSSNum(), e2);
		hmEmployees.put(e3.getSSNum(), e3);
		hmEmployees.put(e4.getSSNum(), e4);

		// Print keys
		System.out.println( "HashMap keys:");
		Set<Integer> keys = hmEmployees.keySet();
		for(int key : keys) System.out.print(key + ", ");
		System.out.println( );

		// Print values
		System.out.println( "\nHashMap values:");
		Collection<Employee> emps = hmEmployees.values();
		for(Employee emp : emps) System.out.println(emp);


		printKeysAndValues(hmEmployees, "\nHashMap before put");
		hmEmployees.put(e3.getSSNum(), e5);
		printKeysAndValues(hmEmployees, "\nHashMap after put");
		
		// Stage 2
		System.out.println("\nStage 2");
		// Set variable to hold the key that has a bad mapping
		int key = 338290448;
		// See if key has a mapping (of course it does in this case)
		boolean isInMap = hmEmployees.containsKey(key);
		System.out.println("\nkey=" + key);
		System.out.println("containsKey(key)=" + isInMap);
		// Remove the bad mapping
		hmEmployees.remove(key);
		
		System.out.println("After remove " + hmEmployees);
		hmEmployees.put(e3.getSSNum(), e3);
		
		// Re-add e5 properly.
		hmEmployees.put(e5.getSSNum(), e5);
		// Get employee with key
		key = 476227851;
		Employee emp = hmEmployees.get(key);
		System.out.println("key=" + key);
		System.out.println("get(key)=" + emp);
		printKeysAndValues(hmEmployees, "\nHashMap after put");

		// Stage 2 - Example a
		//System.out.println("\nExample a");
		//Set<Entry<Integer, Employee>> keys2 = hmEmployees.entrySet();
		//for(Entry<Integer, Employee> k : keys2) {
		//Employee e = hmEmployees.get(k);
		//System.out.println("Key=" + k.getKey() + " Value=" + k.getValue());
		//}
		
		// Stage 2 - Example b
		ArrayList<Integer> keys2 = new ArrayList<>(Arrays.asList(338290448, 476227851 ));
		ArrayList<Employee> emps2 = new ArrayList<>();
		// Write code here.
			
		for(int ssn : keys2){
			Employee e = hmEmployees.get(ssn);
			emps2.add(e);
		}
		
		System.out.println("\nExample b");
		for(Employee e : emps2){
			System.out.println(e);
		}
		
		// Stage 3
		System.out.println("\nStage 3");
		// Create another HashMap and put some Emps in
		Map<Integer,Employee> hmEmployees2 = new HashMap<>();
		hmEmployees2.put(e5.getSSNum(), e5);
		hmEmployees2.put(e6.getSSNum(), e6);
		// Put 2nd map into first.
		hmEmployees.putAll( hmEmployees2 );
		printKeysAndValues(hmEmployees, "\nHashMap after putAll");
		
		// Stage 3 - Example
		System.out.println("\nStage 3 - example");
		// Remove a few values from hmEmployees
		hmEmployees.remove(e5.getSSNum());
		hmEmployees.remove(e6.getSSNum());
		// Write code here…
		Map<Integer, Employee> allEmployeeshm = new HashMap<>(hmEmployees);
		allEmployeeshm.putAll(hmEmployees2);
		printKeysAndValues(allEmployeeshm, "\nHashMap Combined");

		// Stage 4a
		System.out.println("\nStage 4a");
		SortedSet<Integer> keysOrdered = new TreeSet<>(hmEmployees.keySet());
		for(int k : keysOrdered) {
		Employee e = hmEmployees.get(k);
		System.out.println("Key=" + k + " Value=" + e);
		}

		// Stage 4b
		System.out.println("\nStage 4b");
		Map<Integer,Employee> hmDupValues = new HashMap<Integer,Employee>();
		hmDupValues.put(e1.getSSNum(), e1);
		hmDupValues.put(e2.getSSNum(), e1);
		hmDupValues.put(e3.getSSNum(), e1);
		printKeysAndValues(hmDupValues, "\nHashMap with Duplicate Values");
		
		// Stage 4c
		System.out.println("\nStage 4c");
		// Get values collection.
		Collection<Employee> colEmps = hmEmployees.values();
		// Turn collection into list
		List<Employee> listEmps = new ArrayList<Employee>( colEmps );
		// Sort the list
		Comparator<Employee> nameComp = new EmployeeNameComparator();
		Collections.sort( listEmps, nameComp );
		System.out.println( "Values ordered on Name:" );
		for(Employee e : listEmps) System.out.println(e);
		// Or, turn collection into tree set, loses any duplicates.
		System.out.println( "\nValues ordered on Name:" );
		TreeSet<Employee> tSetEmps = new TreeSet<Employee>( colEmps );
		for(Employee e : tSetEmps) System.out.println(e);

	}

	@SuppressWarnings("unused")
	private static void printValues(Collection<Employee> vals) {
		for(Employee e : vals) System.out.println(e);
		System.out.println( );
	}

	private static void printKeysAndValues(Map<Integer,Employee> hmEmployees, String msg) {
		System.out.println(msg);
		Set<Entry<Integer, Employee>> entries = hmEmployees.entrySet();
		for(Entry<Integer,Employee> entry : entries ) {
			System.out.println("Key=" + entry.getKey() + " Value=" + entry.getValue());
		}


	}

}
