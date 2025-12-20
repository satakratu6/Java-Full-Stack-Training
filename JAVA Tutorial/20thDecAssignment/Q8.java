
public class Q8 {
    public static void main(String[] args) {
        int exp=1;
        boolean graduation=false;
        boolean strong_project=true;
        String res=((exp>=2 || strong_project) && graduation) ?"Eligible":"Not Eligible";
        System.out.println(res);
    }
}
