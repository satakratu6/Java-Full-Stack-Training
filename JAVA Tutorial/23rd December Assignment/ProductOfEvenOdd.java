import java.util.Scanner;
public class ProductOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write the starting point: ");
        int m=sc.nextInt();
        System.out.println("Write the end point: ");
        int n=sc.nextInt();
        long evenProduct=1;
        long oddProduct=1;
        for(int i=m;i<n;i++){
            if(i%2==0){
                evenProduct*=i;
            } else{
                oddProduct*=i;
            }
        }
        
        System.out.println(evenProduct+" "+oddProduct);
    }
}

