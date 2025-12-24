import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of calls: ");
        int calls = sc.nextInt();
        double minCost = 200;
        double extraCost = 0;

        if (calls <= 100) {
            System.out.println("Cost is: " + minCost);
        } 
        else if (calls <= 150) {
            extraCost = 0.60 * (calls - 100);
            minCost += extraCost;
            System.out.println("Cost is: " + minCost);
        } 
        else if (calls <= 200) {
            extraCost = 0.50 * (calls - 150) + 0.60 * 50;
            minCost += extraCost;
            System.out.println("Cost is: " + minCost);
        } 
        else {
            extraCost = 0.40 * (calls - 200) + 0.50 * 50 + 0.60 * 50;
            minCost += extraCost;
            System.out.println("Cost is: " + minCost);
        }

        sc.close();
    }
}
