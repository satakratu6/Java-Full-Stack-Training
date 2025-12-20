
public class Q14 {
    public static void main(String[] args) {
        boolean isMidgnight=true;
        boolean isServerLoadLow=true;
        boolean isMaintenence=true;
        String res=((isMidgnight && isServerLoadLow) || isMaintenence)?"System backup is runing":"System backup can't run now";
        System.out.println(res);
    }
}
