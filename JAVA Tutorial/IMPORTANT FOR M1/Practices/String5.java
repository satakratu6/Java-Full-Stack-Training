//Problem:
//You are given a string str and an integer K. Process the string according to the following rules:
//
//Reverse the string.
//
//Replace each vowel in the reversed string with the next vowel in the sequence
//a → e → i → o → u → a.
//Uppercase vowels should remain uppercase after replacement.
//
//Remove duplicate characters from the string while preserving the first occurrence order.
//
//Rotate the resulting string to the right by K positions.
//
//Return the final processed string.

import java.util.HashSet;
import java.util.Set;

public class String5 {
	public static String proccessed(String input, int k) {
		StringBuilder reversed=new StringBuilder(input).reverse();
		for(int i=0;i<reversed.length();i++) {
			char c=reversed.charAt(i);
			boolean u=Character.isUpperCase(c);
			char l=Character.toLowerCase(c);
			if(l=='a') c='e';
			else if(l=='e') c='i';
			else if(l=='i') c='o';
			else if(l=='o') c='u';
			else if(l=='u') c='u';
			reversed.setCharAt(i, u?Character.toUpperCase(c):c);
		}
		StringBuilder r=new StringBuilder();
		Set<Character> st=new HashSet<Character>();
		for(char c:reversed.toString().toCharArray()) {
			if (st.add(c)) r.append(c);
		}
		int n=r.length();
		k%=n;
		return r.substring(n-k)+r.substring(0, n-k);
	}
	public static void main(String[] args) {
		System.out.println(proccessed("hello", 2));
	}
}
