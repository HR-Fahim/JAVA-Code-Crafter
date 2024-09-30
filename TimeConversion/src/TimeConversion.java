import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

	public static void testFunction() {
		LocalTime localTimeObj = LocalTime.now();

		DateTimeFormatter dateTimeFormatterObj = DateTimeFormatter.ofPattern("HH:mm:ssa");

		DateFormat inputFormat = new SimpleDateFormat("hh:mm:ssa");
		DateFormat outputFormat = new SimpleDateFormat("HH:mm:ssa");

		try {
			Date date = inputFormat.parse(localTimeObj.format(dateTimeFormatterObj));
			System.out.println(outputFormat.format(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * Complete the 'timeConversion' function below.
	 *
	 * The function is expected to return a STRING. The function accepts STRING s as
	 * parameter.
	 */

	public static String time12Hour;

	public static String timeConversion(String s) throws ParseException {
		// Write your code here

		time12Hour = s;

		DateFormat inputFormat = new SimpleDateFormat("hh:mm:ssa");
//    	System.out.println(inputFormat);
		DateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");

		// Parse the 12-hour time string
		java.util.Date date = inputFormat.parse(time12Hour);

		// Format the parsed date to 24-hour format
		String time24Hour = outputFormat.format(date);

		return time24Hour;
	}

}

public class TimeConversion {
	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		// Remove the BufferedWriter initialization
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		// Instead, use System.out.println to print the result
		Result.testFunction();
		String s = bufferedReader.readLine();
//		String result = Result.timeConversion(s);
//		System.out.println(result);

		bufferedReader.close();

		// Close the BufferedWriter
		// bufferedWriter.close();
	}
}
