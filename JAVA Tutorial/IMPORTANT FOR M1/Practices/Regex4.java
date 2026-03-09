//Indian Mobile Number
//Conditions
//
//Must start with 6–9
//
//Total 10 digits
//
//Regex

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String regex="[6-9][0-9]{9}";
		String mobile=sc.nextLine();
		System.out.println(Pattern.matches(regex, mobile));
	}
}
