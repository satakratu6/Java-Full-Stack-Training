
public class Q1 {
    public static void main(String[] args) {
        String username="Satakratu";
        String password="sdbhnjui2234%";
        boolean status=true;
        boolean login=(username!=null && password!=null && status!=false);
        String res=login==true?"Logged in":"Can't log in";
        System.out.println(res);

    }
}
