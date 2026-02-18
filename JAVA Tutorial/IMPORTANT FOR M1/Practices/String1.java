//Take the first character of S — call it x.
//Reverse the entire string S — call it rev.
//Insert the character x exactly in the middle of rev:
//If the length of rev is even, insert before the middle.
//If odd, insert exactly at the middle index.
//Return the resulting string.
//🔍 Example
//Input:
// 
//Plain Text
//Plain Text
//S = "hello"
// 
// 
//Steps:
//First character: h
//Reverse string: olleh
//Length = 5 → middle = index 2
//Insert h at index 2:
//ol + h + leh → olhleh
//Output:
// 
//Plain Text
//Plain Text
//olhleh


import java.util.Scanner;

public class String1 {
	public static String transform(String str) {
		char x=str.charAt(0);
		StringBuilder rev=new StringBuilder(str).reverse();
		int mid=(rev.length())/2;
		if(rev.length()%2==0) {
			rev.insert(mid, x);
		} else {
			rev.insert(mid, x);
		}
		return rev.toString();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.nextLine();
		System.out.println(transform(str));

	}

}
