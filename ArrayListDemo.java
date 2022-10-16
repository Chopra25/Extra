import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Initializing and adding elements
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(15);
        arr.add(30);
        arr.add(20);
        arr.add(25);

        // Printing elements using iterator
        Iterator<Integer> iter = arr.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        // Printing element at an index
        int index = 3;
        System.out.println("Element at index " + index + " is " + arr.get(index));

        // Setting element at an index
        arr.set(3, 100);
        System.out.println("Element at index " + index + " is " + arr.get(index));

        // Printing the index and last index of an element
        int element = 20;
        System.out.println("Index of " + element + " is " + arr.indexOf(element));
        System.out.println("Last index of " + element + " is " + arr.lastIndexOf(element));

        // Printing the size of the lis, before and after deletion of elements
        System.out.println("Size of the list is " + arr.size());
        arr.remove(3);
        System.out.println("Size of the list is " + arr.size());

        // Sorting
        arr.sort(null);

        // Resetting the iterator and printing the list again
        iter = arr.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();
    }
}
