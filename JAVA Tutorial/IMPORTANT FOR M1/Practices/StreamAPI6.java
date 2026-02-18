// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.Collectors;
class Employee{
    String name;
    String department;
    String gender;
    int salary;
    Employee(String name, String department, String gender, int salary){
        this.name=name;
        this.department=department;
        this.gender=gender;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public String getGender(){
        return gender;
    }
    public int getSalary(){
        return salary;
    }
    public String toString(){
        return name+department+gender+salary;
    }
}
class EmployeeImplementation{
    // Group by department → gender
    public Map<String, Map<String, List<Employee>>> groupByDepartmentAndGender(List<Employee> list){
        return list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getGender)));
    }
    // Group people based on the first letter of their name.
    public Map<Character, List<Employee>> groupByFirstCharacter(List<Employee> list){
        return list.stream().collect(Collectors.groupingBy(p->p.getName().charAt(0)));
    }
    //Group employees by department but store only names instead of full objects.
    public Map<String, List<String>> groupByDepartment(List<Employee> list){
        return list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
    }
//   Highest Paid Employee per Department
public Map<String, String> highestPaidEmployee(List<Employee> list) {
    return list.stream()
        .collect(Collectors.groupingBy(
            Employee::getDepartment,
            Collectors.collectingAndThen(
                Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                emp -> emp.map(Employee::getName).orElse(null)
            )
        ));
}
                                      
}
class Main {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee("Prateek","IT","Male",70000));
        list.add(new Employee("Piyush","IT","Male",40000));
        list.add(new Employee("Pratyusha","IT","Female",30000));
        list.add(new Employee("Priyanshu","IT","Male",50000));
        list.add(new Employee("Rahul","HR","Male",20000));
        list.add(new Employee("Preeti","HR","Female",25000));
        EmployeeImplementation em=new EmployeeImplementation();
        System.out.println(em.groupByDepartmentAndGender(list));
        System.out.println(em.groupByFirstCharacter(list));
        System.out.println(em. groupByDepartment(list));
        System.out.println(em. highestPaidEmployee(list));


   }
}