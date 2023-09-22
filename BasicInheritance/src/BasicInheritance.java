

import java.io.*;
import java.util.*;

abstract class Student {
	public static String firstName;
	public static String lastName;
	public static String ID;
//	public static int Score[];
}

class studentName extends Student {
	public void printName(String first_name, String last_name) {
		firstName = first_name;
		lastName = last_name;

		System.out.println("Name: " + lastName + ", " + firstName);
	}

}

class studentID extends studentName {
	public void printID(String id) {
		ID = id;
		if (ID.length() >= 7) {
			System.out.println("ID: " + ID);
		}
	}

}

class studentScore extends studentID {
	public void printScore(int array[]) {
		int sum = 0;
		for(int a=0;a<array.length;a++) {
			sum = sum + array[a];
		}
		int result = sum/array.length;
		
		System.out.print("Grade: ");
		
		if(result >= 90 && result <= 100) {
			System.out.println("O");
		}
		else if(result >= 80 && result < 90) {
			System.out.println("E");
		}
		else if(result >= 70 && result < 80) {
			System.out.println("A");
		}
		else if(result >= 55 && result < 70) {
			System.out.println("P");
		}
		else if(result >= 40 && result < 55) {
			System.out.println("D");
		}
		else{
			System.out.println("T");
		}
	}

}

public class BasicInheritance extends studentScore {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		Scanner input = new Scanner(System.in);

		String firstName = input.next();
		String lastName = input.next();

		String ID = input.next(); 
		
		int n = input.nextInt();
		
		int arr[] = new int[n];

		for(int i=0;i<n;i++) {
			arr[i] = input.nextInt();
		}

		studentName name = new studentName();
		name.printName(firstName, lastName);

		studentID id = new studentID();
		id.printID(ID);
		
		studentScore grade = new studentScore();
		grade.printScore(arr);

	}
}