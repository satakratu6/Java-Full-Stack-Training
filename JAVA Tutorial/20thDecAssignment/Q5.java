
public class Q5 {
    public static void main(String[] args) {
        int CpuUsage=90;
        int memoryUsage=90;
        boolean Maintanance=false;
        String res=((CpuUsage>=85 || memoryUsage>=90) && !Maintanance)?"Unstable":"Stable";
        System.out.println(res);
    }
}
