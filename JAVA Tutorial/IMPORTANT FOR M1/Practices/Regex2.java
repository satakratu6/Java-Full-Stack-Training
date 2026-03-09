import java.util.regex.Pattern;

public class Regex2 {
	public static void main(String[] args) {
		String regex="^[a-zA-Z]{4,}\\.[a-zA-Z]+[0-9]{4}@[a-zA-Z]+\\.com";
		String email="satakratu.madhu1234@gmail.com";
		if(Pattern.matches(regex, email)) {
			System.out.println("Valid Email");
		} else {
			System.out.println("Invalid email");
		}
	}
}
