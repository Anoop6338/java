import java.util.PriorityQueue;

public class basic_pq {
    public static void main(String[] args) {
                //priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());    // for reverse order i.e high to low
        pq.add(30);
        pq.add(20);
        pq.add(50);
        pq.add(40);
        pq.add(10);

        System.out.println(pq);

        while(! pq.isEmpty()){
            System.out.println(pq.remove());
            System.out.println(pq);
        }
    }
}
