import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Kindly give the marks obtained by the student: ");
        int marks=sc.nextInt();
        if(marks>=40){
            System.out.println("Student has passed the exam");
            if(marks>=80){
                System.out.println("Grade is: A");
                
            } else if(marks>=60 && marks<=70){
                System.out.println("Grade is: B");
            }
        } else{
            System.out.println("Student has failed the exam");
        }
        sc.close();
        }
    }

