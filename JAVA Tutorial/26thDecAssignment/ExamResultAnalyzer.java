//Creates a method that accepts marks of three subjects as parameters and returns the grade.
// the calling method should decide whether the student is eligible for placement training
import java.util.*;
public class ExamResultAnalyzer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mark for the 1st Subject: ");
        int n1=sc.nextInt();
        System.out.println("Enter mark for the 2nd Subject: ");
        int n2=sc.nextInt();
        System.out.println("Enter mark for the 3rd Subject: ");
        int n3=sc.nextInt();
        char grade=grade(n1, n2, n3);
        placement(grade);
        sc.close();
    }
    public static char grade (int n1, int n2, int n3){
        double percentage=((n1+n2+n3)/3);
        if(percentage>=90){
            return 'A';
        } else if(percentage>=80 && percentage<90){
            return 'B';
        } else if(percentage>=70 && percentage<80){
            return 'C';
        } else {
            return 'F';
        }
        
    }
    public static void placement(char grade){
        if(grade>='A' && grade<='C'){
            System.out.println("Grade of Student: "+grade);
            System.out.println("Student is eligilble for placement");
        } else{
            System.out.println("Student is not eligible for placement");
        }
    }
}
