import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		Queue<Integer> pque = new PriorityQueue<>();
		System.out.println("\nOrder into both Queues: ");
		for(int i=0; i<10; i++) {
			int val = (int)(Math.random()*10);
			System.out.print(val + " ");
			que.offer(val);
			pque.offer(val);
		}
		System.out.println();
		System.out.println("\nOrder out of Queue: ");
		processQ(que);
		System.out.println("\nOrder out ofPriority Queue: ");
		processQ(pque);

	}
	private static void processQ(Queue<Integer> q) {
		while( q.size() > 0) {
			System.out.print(q.poll() + " ");
		}
		System.out.println();
		
	}

}
