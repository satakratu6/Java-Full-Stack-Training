import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write the experience and graduation and strong project: ");
        int exp=sc.nextInt();
        boolean graduation=sc.nextBoolean();
        boolean strongProject=sc.nextBoolean();
        String res=((exp>=2 || strongProject) && graduation) ?"Eligible":"Not Eligible";
        System.out.println(res);
        sc.close();
    }
}
