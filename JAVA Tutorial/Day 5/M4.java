public class M4 {
    public static void main(String[] args) {
        m1(m2(),m3(1),2);
    }
    public static void m1(int i,int x,int a){
        System.out.println("m1() ->"+a);
        System.out.println("m2() -> "+i);
        System.out.println("m3(int a) -> "+x);
        
    } 
    public static int m2(){
        // System.out.println("m2() method ");
        return 10;
    } 
    public static int m3(int b){
        return b;
    }
}
