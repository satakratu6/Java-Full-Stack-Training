import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write the marks that obtained: ");
        int c=sc.nextInt();
        switch(c/10){
            case 10:
            case 9:
            case 8:
                System.out.println("Grade A");
                break;
            case 7:
            case 6:
                System.out.println("Grade B");
                break;
            case 5:
                System.out.println("Grade C");
                break;
            case 4:
                System.out.println("Grade D");
                break;
            default:
                System.out.println("Grade F");
        }
        sc.close();
    }
}
