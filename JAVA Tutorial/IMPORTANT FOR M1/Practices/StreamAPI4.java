// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.Collectors;
class Person{
    private String name;
    private int age;
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return name+age;
    }
}
class StreamImplementation{
    public int sumAge(List<Person> list){
        return list.stream().filter(e->e.getAge()>50).mapToInt(Person::getAge).sum();
    }
    public List<String> printName(List<Person> list){
        return list.stream().map(Person::getName).collect(Collectors.toList());
    }
    public List<Integer> printAge(List<Person> list){
        return list.stream().map(Person::getAge).collect(Collectors.toList());
    }
}
class StreamAPI4 {
    public static void main(String[] args) {
        List<Person> list=new ArrayList<>();
        Person person[]={
            new Person("tapan",55),
            new Person("hishuk",89),
            new Person("prateek",45),
            new Person("kingshuk",34)
        };
        for(Person p:person){
            list.add(p);
        }
        StreamImplementation sm=new StreamImplementation();
        System.out.println(sm.sumAge(list));
        System.out.println(sm.printName(list));
        System.out.println(sm.printAge(list));
    }
}