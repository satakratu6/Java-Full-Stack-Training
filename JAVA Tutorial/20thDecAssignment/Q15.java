
public class Q15 {
    public static void main(String[] args) {
        boolean IsThereAnyBacklog=false;
        double cgpa=7.6;
        boolean IsThereAnyInternshipExp=true;
        String res=(!IsThereAnyBacklog && (7.6>=7.5 || IsThereAnyInternshipExp))?"Student is Qualified for Placement":
        "Student is Not Qualified for Placement";
        System.out.println(res);
        
    }
}
