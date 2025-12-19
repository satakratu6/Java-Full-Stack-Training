public class Exercise2 {
    public static void main(String[] args) {
        int a=13, b=12, c=20;
        int res=(a>=b && a>=c) ? a : (b>=a && b>=c)?b:c;
        System.out.println(res);
        
    }
}
