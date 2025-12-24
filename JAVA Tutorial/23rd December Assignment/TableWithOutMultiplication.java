import java.util.Scanner;
public class TableWithOutMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value: ");
        int n=sc.nextInt();
        int add=0;
        for(int i=0;i<10;i++){
            add+=n;
            System.out.println(n+" x "+i+" = "+add);
        }
        sc.close();
    }
}
