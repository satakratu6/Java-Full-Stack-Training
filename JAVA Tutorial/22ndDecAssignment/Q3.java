import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int minBalance=1000;
        System.out.println("Is the account flagged? ");
        boolean isFlagged=sc.nextBoolean();
        System.out.println("Write the current balance of the account");
        int currBalance=sc.nextInt();
        if(!isFlagged){
            if(currBalance>=minBalance){
                System.out.println("Active");
            } else if (currBalance<minBalance) {
                System.out.println("Low Balance");
            }
        } else{
            System.out.println("Frozen");
        }
        sc.close();
    }
}
