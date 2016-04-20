import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQExample {

	public static void main(String[] args) 
	{
		// Create employees
		Employee e1 = new Employee("Boggs", "Kay", 716533892, 12.57);
		Employee e2 = new Employee("Lyton", "Ben", 476227851, 77.88);
		Employee e3 = new Employee("Boggs", "Amy", 553572246, 22.32);
		Employee e4 = new Employee("Dern", "Donald", 243558673, 23.44);

		// Create priority queue to hold Employee objects ordering by SSN
		Queue<Employee> pqEmps = new PriorityQueue<>(20, new EmployeeSSNComparator() );
		
		// Add employees to p.queue
		pqEmps.offer(e1);
		pqEmps.offer(e2);
		pqEmps.offer(e3);
		pqEmps.offer(e4);
		
		// Process the items in the Queue
		processQueue(pqEmps);

	}
	
	private static void processQueue(Queue<Employee> qEmps) {
		System.out.println("Process items in Priority Queue");
		// Loop until queue is empty
		while( qEmps.size() > 0) {
			// Remove employee from head of queue and print
			System.out.println( "   " + qEmps.poll());			
		}
	}


}
