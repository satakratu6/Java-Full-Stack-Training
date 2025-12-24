import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Is course expired? ");
        boolean isCourseExpired=sc.nextBoolean();
        if(!isCourseExpired){
            System.out.println("Has the student paid for the course? ");
            boolean isPaid=sc.nextBoolean();
            System.out.println("Does student have scholarship? ");
            boolean isScholarship=sc.nextBoolean();
            if(isPaid || isScholarship){
                System.out.println("Student can access the course");
            } else{
                System.out.println("Student can't access the course");
            }
        } else{
            System.out.println("Course has already been expired");
        }
        sc.close();
    }
}
