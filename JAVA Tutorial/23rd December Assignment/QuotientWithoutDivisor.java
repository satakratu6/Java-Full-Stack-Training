import java.util.Scanner;
public class QuotientWithoutDivisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int divisor=sc.nextInt();
        int dividend=sc.nextInt();
        int temp=dividend;
        int quotient=0;
        while(temp>=divisor){
            temp-=divisor;
            quotient++;
        }
        System.out.println(quotient);
    }
}
