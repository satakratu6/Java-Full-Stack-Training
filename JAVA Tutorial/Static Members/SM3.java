public class SM3 {
    int age;
    String name;
    public void get(){
        System.out.println("Age: "+age+" and name: "+name);
    }
    public static void main(String[] args) {
        SM3 sm=new SM3();
        sm.age=18;
        sm.name="Satakratu";
        sm.get();
        System.out.println("This is main function: ");
    }
}
