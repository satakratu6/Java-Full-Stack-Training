import java.util.Scanner;
class example{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("Enter value: ");
        int b1=sc.nextByte();
        byte b2=(byte)sc.nextInt();
        System.out.println(b1);
        System.out.println(b2);

        sc.close();
    }
}