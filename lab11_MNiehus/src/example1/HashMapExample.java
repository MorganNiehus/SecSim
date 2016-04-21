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
		ArrayList<Integer> keys2 = new ArrayList<>(Arrays.asList(338290448, 4, 476227851 ));
		ArrayList<Employee> emps2 = new ArrayList<>();
		// Write code here.
			
		for(int ssn : keys2){
			Employee e = hmEmployees.get(ssn);
			emps2.add(e);
		}
		
		System.out.println("\nExample b");
		System.out.println(emps2);



	}

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
