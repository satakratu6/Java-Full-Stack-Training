import java.util.Scanner;
public class SummationOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write the starting point: ");
        int m=sc.nextInt();
        System.out.println("Write the end point: ");
        int n=sc.nextInt();
        long evenSum=0;
        long oddSum=0;
        for(int i=m;i<n;i++){
            if(i%2==0){
                evenSum+=i;
            }
            if(i%2==0){
                oddSum+=i;
            }
        }
        System.out.println(oddSum+evenSum);
    }
    }

