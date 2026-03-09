//Problem:
//Given a string str, perform the following operations and print the resulting string.
//
//Step 1 — Split the string
//
//Divide the string into two halves:
//
//left → first half
//
//right → second half
//
//If the length is odd, the extra character goes to the right half.
//
//Step 2 — Reverse both halves
//
//Reverse the characters of both halves separately.
//
//Example:
//
//Input:  abcdef
//left  = abc
//right = def
//
//leftRev  = cba
//rightRev = fed
//Step 3 — Interleave the reversed halves
//
//Create a new string by alternating characters from the reversed halves.
//
//Example:
//
//cba
//fed
//
//Interleave → cfbead
//Step 4 — Insert the first character at prime positions
//
//Let x be the first character of the original string.
//
//Insert x into the new string at prime positions (2, 3, 5, 7, …).
//
//Prime numbers are numbers greater than 1 divisible only by 1 and itself.


import java.util.Scanner;

public class String2 {

    public static String transform(String str) {

        if(str == null || str.length() <= 1)
            return str;

        int mid = str.length() / 2;

        String left = str.substring(0, mid);
        String right = str.substring(mid);

        StringBuilder leftRev = new StringBuilder(left).reverse();
        StringBuilder rightRev = new StringBuilder(right).reverse();

        StringBuilder interleave = new StringBuilder();

        int i = 0, j = 0;

        // Interleave
        while(i < leftRev.length() && j < rightRev.length()) {
            interleave.append(leftRev.charAt(i++));
            interleave.append(rightRev.charAt(j++));
        }

        while(i < leftRev.length()) {
            interleave.append(leftRev.charAt(i++));
        }

        while(j < rightRev.length()) {
            interleave.append(rightRev.charAt(j++));
        }

        char x = str.charAt(0);

        int originalLength = interleave.length();
        int index = 2;

        while(index <= originalLength){

            if(isPrime(index)){
                interleave.insert(index - 1, x);
                originalLength++; // because string grew
                index++; // skip inserted char
            }

            index++;
        }
        return interleave.toString();
    }

    public static boolean isPrime(int number) {

        if(number < 2) return false;

        for(int i = 2; i * i <= number; i++) {
            if(number % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.println(transform(str));
    }
}
