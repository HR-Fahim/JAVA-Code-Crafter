
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

class CCClass {

	public CCClass(String str) {
		// TODO Auto-generated constructor stub
		StringBuilder spacedWord = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(0) == 'C' && str.charAt(2) == 'C' && i > 3) {

				if (i == 4) {
					spacedWord.append(str.toUpperCase().charAt(4));
				}
				else if (Character.isSpaceChar(str.charAt(i))) {

					spacedWord.append(str.toUpperCase().charAt(i + 1));
					for (int j = i + 2; j < str.length(); j++) {
						spacedWord.append(str.charAt(j));
					}
					break;
				}
				else if (i > 4) spacedWord.append(str.charAt(i));
			}
		}
		String result = spacedWord.toString();
		System.out.println(result);
	}

}

class CMClass {

	public CMClass(String str) {
		// TODO Auto-generated constructor stub
		StringBuilder spacedWord = new StringBuilder();
		
		String[] chars = StringUtils.split(str);

		for (String c : chars) {
			spacedWord.append(StringUtils.capitalize(c.toLowerCase()));
		}

		String result = spacedWord.toString();
		for(int i = 4 ; i < result.length() ; i++) {
			System.out.print(result.charAt(i));
		}
		System.out.print("()");
		System.out.println();
	}

}
class CVClass {

	public CVClass(String str) {
		// TODO Auto-generated constructor stub
		StringBuilder spacedWord = new StringBuilder();
		
		String[] chars = StringUtils.split(str);

		for (String c : chars) {
			spacedWord.append(StringUtils.capitalize(c.toLowerCase()));
		}

		String result = spacedWord.toString();
		for(int i = 4 ; i < result.length() ; i++) {
			System.out.print(result.charAt(i));
		}
		//System.out.print("()");
		System.out.println();
	}

}
class SCClass {

	public SCClass(String str) {
		// TODO Auto-generated constructor stub
		StringBuilder spacedWord = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(0) == 'S' && str.charAt(2) == 'C' && i > 3) {
				if (i == 4) {
					spacedWord.append(str.toLowerCase().charAt(i));					
				}				
				else if (i > 4 && Character.isUpperCase(str.charAt(i))) {
					spacedWord.append(" ");
					spacedWord.append(str.toLowerCase().charAt(i));
				}
				else if (i > 4) {
					spacedWord.append(str.charAt(i));
				}
			}				
		}
		String result = spacedWord.toString();
		System.out.println(result);
	}

}
class SMClass {

	public SMClass(String str) {
		// TODO Auto-generated constructor stub
		StringBuilder spacedWord = new StringBuilder();
		
		str = str.replaceAll("[\\(\\)\\[\\]]", ""); // Keep updated str into str

		for (int i = 0; i < str.length(); i++) {			

			if (str.charAt(0) == 'S' && str.charAt(2) == 'M' && i > 3) {

				if (Character.isUpperCase(str.charAt(i))) {

					spacedWord.append(" "); 
				}
				spacedWord.append(str.toLowerCase().charAt(i)); // Append the current character
			}
		}
		String result = spacedWord.toString(); // Append convert & print
        System.out.println(result);
	}

}
class SVClass {

	public SVClass(String str) {
		// TODO Auto-generated constructor stub
		StringBuilder spacedWord = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {			

			if (str.charAt(0) == 'S' && str.charAt(2) == 'V' && i > 3) {

				if (Character.isUpperCase(str.charAt(i))) {

					spacedWord.append(" "); 
				}
				spacedWord.append(str.charAt(i)); // Append the current character
			}
		}
		String result = spacedWord.toString(); // Append convert & print
        System.out.println(result.toLowerCase());
	}

}

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str;

        while (true) {

            if (scanner.hasNextLine()) {
                str = scanner.nextLine();

                if (str.isEmpty()) {
                    break; // Exit the loop if no input is available
                }

                str = str.trim(); // Trim leading/trailing whitespace

                if (str.charAt(0) == 'S' && str.charAt(2) == 'M') {
                    SMClass SM = new SMClass(str);
                } else if (str.charAt(0) == 'C' && str.charAt(2) == 'V') {
                    CVClass CV = new CVClass(str);
                } else if (str.charAt(0) == 'C' && str.charAt(2) == 'C') {
                    CCClass CC = new CCClass(str);
                } else if (str.charAt(0) == 'S' && str.charAt(2) == 'C') {
                    SCClass SC = new SCClass(str);
                } else if (str.charAt(0) == 'C' && str.charAt(2) == 'M') {
                    CMClass CM = new CMClass(str);
                } else if (str.charAt(0) == 'S' && str.charAt(2) == 'V') {
                    SVClass SV = new SVClass(str);
                }
            } else {
                break; // Exit the loop if no input is available
            }
        }
        scanner.close(); // Close the scanner when done
    }
}
