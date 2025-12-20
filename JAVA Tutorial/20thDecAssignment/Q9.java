
public class Q9 {
    public static void main(String[] args) {
        int loginAttempt=4;
        boolean locked=false;
        String res=(loginAttempt>=3 && !locked) ? "Alert": "Alredy Locked";
        System.out.println(res);
    }
}
