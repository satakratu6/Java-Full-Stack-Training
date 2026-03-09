import java.util.regex.Pattern;

public class Regex1 {
	public static void main(String[] args) {
		String regex="^([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}::([0-9A-F]{2}:){5}[0-9A-F]{2}$";
		String input="2001:0db8:85a3:0000:0000:8a2e:0370:7334::AA:BB:CC:DD:EE:FF";
		System.out.println(Pattern.matches(regex, input));
	}
}
