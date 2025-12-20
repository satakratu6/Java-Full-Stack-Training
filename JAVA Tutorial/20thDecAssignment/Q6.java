
public class Q6 {
    public static void main(String[] args) {
        int age=21;
        boolean banned=true;
        String res=(age>=18 && !banned)?"Can Access":"Can't Access";
        System.out.println(res);
    }
}
