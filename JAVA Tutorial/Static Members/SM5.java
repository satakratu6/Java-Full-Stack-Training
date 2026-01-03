public class SM5 {
    int age;
    String name;
    public void get(){
        System.out.println("Age: "+age+" and name: "+name);
    }
     SM5 sm=new SM5();
        sm.age=18;
        sm.name="Satakratu";
        System.out.println("This is main function: ");
        sm.get();
    public static void main(String[] args) {
       
    }
    static{
        System.out.println("This is multiline static intialization");
    }
}
