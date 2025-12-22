import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please write CPU Usage, Memory Usage and is it under maintanance or not");
        int cpuUsage=sc.nextInt();
        int memoryUsage=sc.nextInt();
        boolean maintanance=sc.nextBoolean();
        String res=((cpuUsage>=85 || memoryUsage>=90) && !maintanance)?"Unstable":"Stable";
        System.out.println(res);
        sc.close();
    }
}
