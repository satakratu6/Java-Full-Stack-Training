import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write the units to buy: ");
        int unit=sc.nextInt();
        int totalCost=unit*100;
        int discount=0;
        if(totalCost>1000){
            discount=totalCost/10;
            totalCost-=discount;
            System.out.println("Discounted price: "+totalCost);
        } else{
            System.out.println("No DIscount");
        }
        sc.close();
    }
}
