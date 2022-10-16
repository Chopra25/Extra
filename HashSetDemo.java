import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        // Initializing and adding elements
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(15);
        hs.add(30);
        hs.add(20);
        hs.add(25);

        // Printing elements using iterator
        Iterator<Integer> iter = hs.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        // Printing the size of the lis, before and after deletion of elements
        System.out.println("Size of the list is " + hs.size());
        hs.remove(10);
        System.out.println("Size of the list is " + hs.size());

        // Resetting the iterator and printing the list again
        iter = hs.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();
    }
}
