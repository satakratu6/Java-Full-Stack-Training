import java.util.Scanner;
public class SummationofNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting number: ");
        int m=sc.nextInt();
        System.out.println("Enter starting number: ");
        int n=sc.nextInt();
        System.out.println("The numbers are divisible hy 7: ");
        int sum=0;
        for(int i=m;i<n;i++){
            if(i%5==0){
                sum+=i;
            }
        }
        System.out.println("The summation of numbers are divisible hy 5: "+sum);

    }
}
