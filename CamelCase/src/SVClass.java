
public class SVClass {

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
