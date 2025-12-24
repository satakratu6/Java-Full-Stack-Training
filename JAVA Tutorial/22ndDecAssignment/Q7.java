import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write the experience: ");
        int exp=sc.nextInt();
        System.out.println("Write the performance rating: ");
        int rating=sc.nextInt();
        if(exp>=5 && rating>=4){
            System.out.println("Employee can get a bonus");
        } else{
            System.out.println("Employee is not eligible for bonus");
        }
        sc.close();
    }
}
