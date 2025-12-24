import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age=sc.nextInt();
        System.out.println("Enter Gender(F/M): ");
        char gender=sc.next().charAt(0);
        if(gender=='F'){
            System.out.println("She will work only in Urban areas");
        } else if(gender=='M'){
            if(age>=20&& age<=40){
                System.out.println("He may work in anywhere");
            } else if(age>=40 && age<=60){
                System.out.println("Hw will work in urban areas only");
            }
        } else{
            System.out.println("ERROR");
        }
        sc.close();
    }
}
