//Possible Problem Statement
//
//Write a Java function transform(String str) that processes a sentence according to the following rules.
//
//Conditions
//
//The input string must contain only alphabetic characters and spaces.
//
//If any character other than a letter appears, return null.
//
//Split the string into words using spaces.
//
//If the number of words is odd:
//
//Reverse each word individually.
//
//Keep the word order the same.
//
//If the number of words is even:
//
//Reverse the order of words.
//
//Do not reverse the characters inside each word.
//
//Return the transformed string.


import java.util.*;

public class String3 {
	public static String transform(String str) {
		for(char ch:str.toCharArray()) {
			if(!Character.isLetter(ch)) {
				return null;
			}
		}
		String[] list=str.trim().split("\\s+");
		StringBuilder sm=new StringBuilder();
		if(list.length%2!=0) {
			for(String m:list) {
				StringBuilder string =new StringBuilder(m);
				sm.append(string.reverse().toString()).append(" ");
				
			}
		} else {
			for(int i=list.length-1;i>=0;i--) {
				sm.append(list[i]).append(" ");
			}
		}
		return sm.toString();
	}
	public static void main(String[] args) {
		System.out.println(transform("Hello My World"));
		System.out.println(transform("Top Brains"));

	}

}
