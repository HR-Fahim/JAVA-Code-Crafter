
public class SCClass {

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