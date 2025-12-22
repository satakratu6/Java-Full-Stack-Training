import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write whether there are any backlogs, cgpa and any internship if done: ");
        boolean IsThereAnyBacklog=sc.nextBoolean();
        double cgpa=sc.nextDouble();
        boolean IsThereAnyInternshipExp=sc.nextBoolean();
        String res=(!IsThereAnyBacklog && (cgpa>=7.5 || IsThereAnyInternshipExp))?"Student is Qualified for Placement":
        "Student is Not Qualified for Placement";
        System.out.println(res);
        sc.close();
        
    }
}
