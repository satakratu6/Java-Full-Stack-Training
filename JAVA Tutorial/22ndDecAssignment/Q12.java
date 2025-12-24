import java.util.Scanner;
class Q12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter your choice: \n1  - Poor\r\n" + //
                        "2 - Average\r\n" + //
                        "3 - Good\r\n" + //
                        "4 - Excellent");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Poor");
                break;
            case 2:
                System.out.println("Average");
                break;
            case 3:
                System.out.println("Good");
                break;
            case 4:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Wrong Choice!!");
        }
        sc.close();
    }
}