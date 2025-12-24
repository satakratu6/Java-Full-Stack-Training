import java.util.Scanner;
public class AlphabetbyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println((char)(n+'a'-1));
    }
}
