import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomValue {
    public static void main(String[] args) {
        int randomNumber = ThreadLocalRandom.current().nextInt(0, 11); // Generates a number between 0 (inclusive) and 11 (exclusive)
        System.out.println("Random number between 0 and 10: " + randomNumber);
        
        int randomNumber1 = (int) (Math.random() * 11); // Generates a number between 0 and 10
        System.out.println("Random number between 0 and 10: " + randomNumber1);
        
        int randomNumber11 = (int) (Math.random() * 6) + 5; // Generates a number between 5 and 10
        System.out.println("Random number between 5 and 10: " + randomNumber11);
        
        Random random = new Random();
        int randomNumber111 = random.nextInt(11); // Generates a number between 0 (inclusive) and 11 (exclusive)
        System.out.println("Random number between 0 and 10: " + randomNumber111);
    }
}
