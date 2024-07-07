
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
    }
}
