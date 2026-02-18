// public class HashMap2 {
    
// }
// Scenario 1 — Student Grade Manager

// Problem Statement:

// A university wants to build a Student Grade Management System.

// Create a class StudentManager that uses a HashMap<String, Integer> where:

// Key → Student Name

// Value → Marks

// Requirements:

// Implement the following methods:

// 1️⃣ addStudent(String name, int marks)

// Add a student to the map.

// If the student already exists, print "Student already exists".

// 2️⃣ getMarks(String name)

// Return "Marks: <marks>" if found.

// Otherwise return "Student not found".

// 3️⃣ updateMarks(String name, int newMarks)

// Update only if the student exists.

// 4️⃣ classAverage()

// Return the average marks of all students.

// 5️⃣ topper()

// Return the name of the student with highest marks.




import java.util.*;

class StudentManager {

    private HashMap<String, Integer> map = new HashMap<>();

    public void addStudent(String name, int marks){
        if(map.containsKey(name)){
            System.out.println("Student already exists");
        }else{
            map.put(name, marks);
        }
    }

    public void updateMarks(String name, int marks){
        if(map.containsKey(name)){
            map.put(name, marks);
        }else{
            System.out.println("Student not found");
        }
    }

    public int classAverage(){
        if(map.isEmpty()) return 0;

        int sum = 0;
        for(int m : map.values()){
            sum += m;
        }
        return sum / map.size();
    }
}

class HashMap2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();

        while(sc.hasNext()){

            String action = sc.next();

            if(action.equals("A")){
                String name = sc.next();
                int marks = sc.nextInt();
                sm.addStudent(name, marks);
            }
            else if(action.equals("U")){
                String name = sc.next();
                int marks = sc.nextInt();
                sm.updateMarks(name, marks);
            }
        }

        System.out.println("Average: " + sm.classAverage());
    }
}