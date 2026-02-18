import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Comparator1{
    public static void main(String[] args){
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(201,"John",50000.0));
        list.add(new Employee(103,"Emma",75000.0));
        list.add(new Employee(150,"Liam",62000.0));
        list.add(new Employee(120,"Olivia",58000.0));
        System.out.println("Employees before sorting:");
        for(Employee e:list){
            System.out.println(e);
        }
        Collections.sort(list);
        System.out.println();
        System.out.println("Employees after sorting:");
        for(Employee e:list){
            System.out.println(e);
        }
    }
}

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private double salary;
    Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public String toString(){
        return "ID: "+id+", Name: "+name+", Salary: "+salary;
    }
    @Override
    public int compareTo(Employee o){
        return this.id-o.id;
    }
//    @Override
//    public double compareTo(Employee o) {
//        return this.salary.compareTo(o.salary);
//    }
//    @Override
//    public int compareTo(Employee o) {
//        return Double.compare(this.salary, o.salary);
//    }
}