
public class SMClass {

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