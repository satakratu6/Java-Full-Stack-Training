import java.util.Scanner;
public class HappyNumbers {
    public static void main(String[] args) {
        int count =0;
        for(int i=1;i<=500;i++){
            int num=check(i);
            if(num==1){
                System.out.println(i+" is a happy number");
            }
        }
    }
    public static int check(int n){
        while(n!=1 && n!=4){
            int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit;
            n=n/10;
        }
        n=sum;
     }
        return n;
    }
}
