
import java.util.*; // Importing all classes from the java.util package

public class Important {
    public static void main(String[] args) {
        // Initializing a list with integers using List.of()
        List<Integer> list = List.of(0, 5, 3, 2, 4, 1, 6);
        
        // Creating a new ArrayList from the list 'a'
        ArrayList<Integer> array = new ArrayList<>(list);
        
        // Sorting the ArrayList 'array'
        Collections.sort(array);
        
        // Counting the number of elements in the ArrayList
        int count = (int) array.stream().mapToInt(Integer::intValue).count();
        
        // Calculating the sum of all elements in the ArrayList
        int sum = array.stream().mapToInt(Integer::intValue).sum(); 
        
        // Printing the average of the elements in the ArrayList
        System.out.println(sum / count);
        
//        for (int num : list) {
//            System.out.println(num);
//        }
        
    	/* Original matrix position: (i, j)
 	 	   Horizontal flip: (i, 2 * n - 1 - j)
 	       Vertical flip: (2 * n - 1 - i, j)
 	       Both flips: (2 * n - 1 - i, 2 * n - 1 - j)
 	    */
        
//        matrix.get(1).set(2, 42); // Set value 42 at row 1, column 2

    }
}
