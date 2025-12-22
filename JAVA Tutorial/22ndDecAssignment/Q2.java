import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write the Working Hours of the employee");
        int workingHours=sc.nextInt();
        if(workingHours>=8){
            System.out.println("Present");
        } else if(workingHours>=4 && workingHours<8){
            System.out.println("Half-Day");
        } else{
            System.out.println("Absent");
        }
    }
}
