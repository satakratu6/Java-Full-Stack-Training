import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the total attendence, medicalceritificate, and feestatus");
        int totalAttendence=sc.nextInt();
        boolean medicalCerttificate=sc.nextBoolean();
        boolean feeStatus=sc.nextBoolean();
        String res=(totalAttendence>=75  && feeStatus)?"Allowed to attend the exam":(medicalCerttificate && feeStatus)?"Allowed":"Not allowed";
        System.out.println(res);
        sc.close();
    }
}
