import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean isMidgnight=sc.nextBoolean();
        boolean isServerLoadLow=sc.nextBoolean();
        boolean isMaintenence=sc.nextBoolean();
        String res=((isMidgnight && isServerLoadLow) || isMaintenence)?"System backup is runing":"System backup can't run now";
        System.out.println(res);
    }
}
