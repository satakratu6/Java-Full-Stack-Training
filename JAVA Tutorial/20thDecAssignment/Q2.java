
public class Q2 {
    public static void main(String[] args) {
        int TotalAttendence=74;
        boolean MedicalCertificate=true;
        boolean FeeStatus=true;
        String res=(TotalAttendence>=75  && FeeStatus)?"Allowed to attend the exam":(MedicalCertificate && FeeStatus)?"Allowed":"Not allowed";
        System.out.println(res);
    }
}
