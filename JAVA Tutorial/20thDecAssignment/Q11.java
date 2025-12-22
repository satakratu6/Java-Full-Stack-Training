import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Is there any sufficient balance?");
        boolean isSufficient=true;        
        System.out.println("Is the account Active?");
        boolean isActive=true;
        System.out.println("Is the account frozen?");
        boolean isFrozen=true;
        String res=((isActive || !isFrozen) && isSufficient)?"Transaction is Permitted":"Transaction is Not Permitted";
        System.out.println(res);
        sc.close();
    }
}
