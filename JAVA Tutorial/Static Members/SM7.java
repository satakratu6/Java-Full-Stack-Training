public class SM7 {
    int age=16;
    public void get(){
        System.out.println("Age: "+age);
    }
    public static void main(String[] args) {
        SM7 s=new SM7();
        s.get();
        s.age=20;
        s.get();
        s.age=22;
        s.get();
        SM7 s2=new SM7();
        s.age=30;
        s.get();
    }
}
