// Problem:

// You are building a Student Management System.

// Each student has:

// name

// marks

// 👉 Return a list of names of students who scored more than 75.
import java.util.*;
import java.util.stream.Collectors;
class Student{
    private String name;
    private int marks;
    Student(String name, int marks){
        this.name=name;
        this.marks=marks;
    }
    public String toString(){
        return name+marks;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
}
class StudentImplementation{
    public List<Student> getStudentDetails(List<Student> list){
        return list.stream().filter(e->e.getMarks()>75).collect(Collectors.toList());
    }
}
class StreamAPI2{
    public static void main(String[] args) {
        List <Student> list=new ArrayList<>();
        list.add(new Student("Prateek",85));
        list.add(new Student("Piyush",67));
        list.add(new Student("Praan",78));
        list.add(new Student("Satakratu",61));
        StudentImplementation sm=new StudentImplementation();
        System.out.println(sm.getStudentDetails(list));
    }
}



// Online Java Compiler
// Use this editor to write, compile and run your Java code online
