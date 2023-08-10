import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq= new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(32); 
        pq.offer(51); 
        pq.offer(3);

        // pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
