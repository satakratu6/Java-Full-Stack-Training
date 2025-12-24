import java.util.Scanner;
public class DivisibleBySeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting number: ");
        int m=sc.nextInt();
        System.out.println("Enter starting number: ");
        int n=sc.nextInt();
        System.out.println("The numbers are divisible hy 7: ");
        int count=0;
        for(int i=m;i<n;i++){
            if(i%7==0){
                count++;
            }
        }
                        
        System.out.println(count);

    }
}
