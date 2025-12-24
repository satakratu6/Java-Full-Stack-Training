import java.util.Scanner;
public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write the starting point: ");
        int m=sc.nextInt();
        System.out.println("Write the end point: ");
        int n=sc.nextInt();
        for(int i=m;i<n;i++){
            if(i%2!=0){
                System.out.print(" "+i);
            }
        }
    }
}
 {
    
}
