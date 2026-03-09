//Username Validation
//Conditions
//
//Only letters and numbers
//
//Length 5–12 characters
//
//Must start with a letter

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String regex="[a-zA-Z][0-9a-zA-Z]{5,12}";
		String name=sc.nextLine();
		System.out.println(Pattern.matches(regex, name));
		
	}
}
