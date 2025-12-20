
public class Q3 {
    public static void main(String[] args) {
        boolean IdCard=true;
        boolean Permanent=true;
        boolean Contract=false;
        boolean approve=true;
        String res=(IdCard && (Permanent || Contract) && approve)?"Can Enter":"Can't Enter";
        System.out.println(res);
    }
}
