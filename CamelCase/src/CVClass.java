
public class CVClass {

	public CVClass(String str) {
		// TODO Auto-generated constructor stub
		StringBuilder spacedWord = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(0) == 'C' && str.charAt(2) == 'V' && i > 3) {

				if (Character.isSpaceChar(str.charAt(i))) {

					spacedWord.append(str.toUpperCase().charAt(i + 1));
					for (int j = i + 2; j < str.length(); j++) {
						spacedWord.append(str.charAt(j));
					}
					break;
				}
				spacedWord.append(str.charAt(i));
			}
		}
		String result = spacedWord.toString();
		System.out.println(result);
	}

}