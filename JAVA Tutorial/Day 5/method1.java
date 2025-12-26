
public class method1 {
    public static void main(String[] args) {
        System.out.println("Start");
        demo1(); //method calling statement/caller/calling
        System.out.println();
    }
    public static void demo1(){ //called method
        System.out.println("Demo1() method");
        demo2(); //calling
    }
    public static void demo2(){ //called
        System.out.println("Demo2() method");
    }
}
