
// Using Integers

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        // Create an int array with the same size as the ArrayList
        int[] array = new int[arrayList.size()];

        // Copy elements from the ArrayList to the int array
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }

        // Print the elements of the int array
        for (int element : array) {
            System.out.println(element);
        }
    }
}


/*
 * Using Strings
 * 
import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Create an array with the same size as the ArrayList
        String[] array = new String[arrayList.size()];

        // Copy elements from the ArrayList to the array
        arrayList.toArray(array);

        // Print the elements of the array
        for (String element : array) {
            System.out.println(element);
        }
    }
}
*/

