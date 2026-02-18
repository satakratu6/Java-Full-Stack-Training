// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.Collectors;
class Employee{
    private int id;
    private String name;
    private String department;
    private double salary;
    Employee(int id, String name, String department, double salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public double getSalary(){
        return salary;
    }
    public String toString(){
        return id+name+department+salary;
    }
}
class EmployeeImplementation{
    public Map<String, List<Employee>> groupByDepartment(List<Employee> list){
        return list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
    }
    public Map<String, Double> avgSalaryPerDepartment(List<Employee> list){
       return list.stream()
               .collect(Collectors.groupingBy(
                   Employee::getDepartment,
                   Collectors.averagingDouble(Employee::getSalary)
               ));
    }
    public Map<String, Long> countPerDepartment(List<Employee> list){
        return list.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.counting()
            ));
    }
    public Map<String, Double> maxSalaryInEachDepartment(List<Employee> list) {
    return list.stream()
               .collect(Collectors.groupingBy(
                   Employee::getDepartment,
                   Collectors.collectingAndThen(
                       Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                       emp -> emp.map(Employee::getSalary).orElse(0.0)
                   )
               ));
}

}
class StreamAPI5 {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(12, "Satakratu","IT",20000));
        list.add(new Employee(13, "Prateek","IT",30000));
        list.add(new Employee(14, "Saksham","IT",50000));
        list.add(new Employee(15, "Shriyanshu","HR",10000));
        list.add(new Employee(12, "Rahul","HR",34000));
        EmployeeImplementation em=new EmployeeImplementation();
        System.out.println(em.groupByDepartment(list));
        System.out.println(em.avgSalaryPerDepartment(list));
        System.out.println(em.countPerDepartment(list));
        System.out.println(em.maxSalaryInEachDepartment(list));


        
    }
}