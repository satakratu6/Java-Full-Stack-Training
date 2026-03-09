//PAN Card
//Conditions
//
//First 5 uppercase letters
//
//Next 4 digits
//
//Last 1 uppercase letter

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex5 {
	public static void main(String[] args) {
		String regex="^[A-Z]{5}[0-9]{4}[A-Z]$";
		Scanner sc=new Scanner(System.in);
		String pan=sc.nextLine();
		System.out.println(Pattern.matches(regex, pan));
	}
}
