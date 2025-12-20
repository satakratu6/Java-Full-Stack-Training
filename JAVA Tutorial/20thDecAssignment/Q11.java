
public class Q11 {
    public static void main(String[] args) {
        boolean isSufficient=true;
        boolean isActive=true;
        boolean isFrozen=true;
        String res=((isActive || !isFrozen) && isSufficient)?"Transaction is Permitted":"Transaction is Not Permitted";
        System.out.println(res);
    }
}
