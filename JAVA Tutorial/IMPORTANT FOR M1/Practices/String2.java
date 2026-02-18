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
