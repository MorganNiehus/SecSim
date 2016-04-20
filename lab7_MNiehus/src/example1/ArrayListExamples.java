package example1;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExamples {

	public static void main(String[] args) {
//		example1();
//		example2();
//		example3();
//		example4();
		example5();
		
	}
	
	// Illustrates addAll, retainAll, removeAll methods
	private static void example1() {
		// Create an ArrayList of cities
	    ArrayList<String> cities = new ArrayList<String>();
	    cities.add("New York"); 
	    cities.add("San Francisco"); 
	    System.out.println("cities: " + cities);
	    
		// Create another ArrayList of cities
	    ArrayList<String> cities2 = new ArrayList<>();
	    cities2.add("Charlotte");
	    cities2.add("Atlanta");
	    System.out.println("cities2: " + cities2);
	    
	    // addAll() - Adds all the elements of "cites2" to "cities1".
	    // This is the union of two lists.
	    cities.addAll(cities2);
	    
	    System.out.println("cities after cities.addAll(cities2): " + cities);
	    
		// Create another ArrayList of cities
	    ArrayList<String> cities3 = new ArrayList<>();
	    cities3.add("Charlotte");
	    cities3.add("Durango");
	    cities3.add("New York"); 
	    System.out.println("\ncities: " + cities);
	    System.out.println("cities3: " + cities3);
	
	    // retainAll() - This method takes the intersection of the two lists
	    // and stores the result in "cities".
	    cities.retainAll(cities3);
	    System.out.println("cities after cities.retainAll(cities3):" + cities);
	
	    // Add a few more cities to "cities"
	    cities.add("Rock Hill");
	    cities.add("Little Rock");
	    System.out.println("\ncities: " + cities);
		// Create another ArrayList of cities
	    ArrayList<String> cities4 = new ArrayList<>();
	    cities4.add("Charlotte");
	    cities4.add("Seattle");
	    cities4.add("Little Rock");
	    System.out.println("cities4: " + cities4);
	    
	    // removeAll() - Removes from "cities" any cities that are also in "cities4". 
	    // This is set subtracion.
	    cities.removeAll(cities4);
	    System.out.println("cities after cities.removeAll(cities4): " + cities);
	}

	// Illustrates duplicate items
	private static void example2() {
		// Create an ArrayList of cities. Notice that a List can
		// contain duplicate items.
	    ArrayList<String> cities = new ArrayList<String>();
	    String ny = "New York";
	    String sf = "San Francisco";
	    cities.add(ny);
	    cities.add(sf);
	    cities.add(ny);
	    
	    System.out.println("\ncities: " + cities);
	    
	    // What happens when we try to delete a duplicate item?
	    ArrayList<String> cities2 = new ArrayList<String>();
	    cities2.add("New York");
	    cities.removeAll(cities2);
	    System.out.println("cities after cities.removeAll(cities2): " + cities);
	}

	private static void example3() {
		// Create an ArrayList of cities
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Charlotte");
		cities.add("Durango");
		cities.add("New York"); 
		
		// Create an iterator. Note the use of generics 
		// when defining the iterator.
		Iterator<String> iter = cities.iterator();
		System.out.print("\ncities via iterator(): ");
		// Loop over the iterator
		while( iter.hasNext() ) {
			if("Durango".equals(iter.next())){
				iter.remove();
			}
			//System.out.print(iter.next() + ", ");
		}
		System.out.print(cities);
		System.out.println();
	}
	
	private static void example4() {
		// Create an ArrayList of cities
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Charlotte");
		cities.add("Durango");
		cities.add("New York"); 
		
	    // Create array to hold cities
	    String[] aryCities = new String[cities.size()];
	    // Populate array with cities in "cities"
	    aryCities = cities.toArray(aryCities);
	    
	    System.out.println("\ncities in array: " + Arrays.toString(aryCities) );
	    
	    // Create new ArrayList from array.
	    ArrayList<String> cities2 = new ArrayList<>(Arrays.asList(aryCities));
	    
	    System.out.println("\ncities in 'cities2': " + cities2 );
	}

	private static void example5() {
		// Create an ArrayList of cities
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Charlotte");
		cities.add("Durango");
		cities.add("New York"); 
		cities.add("Moab"); 
		cities.add("Berkeley"); 
		cities.add("Phoenix"); 
		
	    // Create a sublist. Note that the return is a List (not an ArrayList)		
		List<String> subList = cities.subList(2, 5);
		
	    System.out.println("\ncities in list: " + cities );
	    System.out.println("\ncities in sublist: " + subList );
	    
	    // Remember, a List is-a Collection. So, the subList has plenty of methods
	    // that can be called on it and is probably adequate for most needs.
	    // However, we can use it to create an ArrayList if needed.		
	    ArrayList<String> cities2 = new ArrayList<>(subList);
	    
	    // Create another ArrayList. Note that we are referring to it as a "List".
	    // We don't have to, we could use ArrayList. We will say more later.
	    // "Collection"
	    AbstractList<String> cities3 = new ArrayList<>();
	    cities3.add("Phoenix");
	    cities3.add("New York");
	    cities3.add("Raleigh");
	    System.out.println("\ncities: " + cities );
	    System.out.println("\ncities3: " + cities3 );
	
	    // Test containsAll
	    System.out.println("\nAre " + cities3 + " all in " + cities + "? " + cities.containsAll(cities3));
	    cities3.remove("Raleigh");
	    System.out.println("\nAre " + cities3 + " all in " + cities + "? " + cities.containsAll(cities3));
	}

}
