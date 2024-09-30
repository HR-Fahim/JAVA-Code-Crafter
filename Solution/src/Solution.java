import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int iter = input.nextInt();		

		for (int i = 0; i < iter; i++) {
			
			int count  = 0;

			double firstVessel = input.nextDouble();
			double secondVessel = input.nextDouble();
			double glass = input.nextDouble();
			
			double total = firstVessel + secondVessel;
			double avg = total / 2;
			
			double maximum = Double.max(firstVessel, secondVessel);
			double minimum = Double.min(firstVessel, secondVessel);
			
//			System.out.println(Math.round(avg));
//			System.out.println(Math.floor(avg));

			if (firstVessel < 0 || secondVessel < 0 || glass < 0) {
				System.out.println(0);
			}
			else if (total == avg) {
				System.out.println(0);
			}
			else {
				while (maximum > avg && minimum <= avg) {
					maximum = maximum - glass;
					minimum = minimum + glass;
//					System.out.println(count);
					count++;
				}
				
				System.out.println(count);
			}		
		}
	}
}