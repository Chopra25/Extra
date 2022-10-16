import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Initializing and adding elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(30);
        pq.add(20);
        pq.add(25);

        // Printing elements using iterator
        Iterator<Integer> iter = pq.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        // Printing the size of the lis, before and after deletion of elements
        System.out.println("Size of the list is " + pq.size());
        pq.remove(20);
        System.out.println("Size of the list is " + pq.size());

        // Printing the top element and deleting it, and printing next top again
        System.out.println("The topmost eleemnt in the priority queue is " + pq.poll());
        System.out.println("The topmost eleemnt in the priority queue is " + pq.peek());

        // Printing the list again
        iter = pq.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        // Custom comparator(default is return 0)
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        // Comparing size of elements via custom comparator
        String o1 = "Adelaide";
        String o2 = "Perth";
        System.out.println("The difference between " + o1 + " and " + o2 + " is " + comp.compare(o1, o2));
    }
}
