public class SM4 {
    int age;
    String name;
    public void get(){
        System.out.println("Age: "+age+" and name: "+name);
    }
    public static void main(String[] args) {
        SM4 sm=new SM4();
        sm.age=18;
        sm.name="Satakratu";
        System.out.println("This is main function: ");
        sm.get();
    }
    static{
        System.out.println("This is multiline static intialization");
    }
}
