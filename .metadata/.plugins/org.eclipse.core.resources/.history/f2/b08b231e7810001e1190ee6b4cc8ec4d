
// Apache Commons Lang library used - https://commons.apache.org/proper/commons-lang/
import org.apache.commons.lang3.StringUtils;

public class CMClass {

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
	}

}
