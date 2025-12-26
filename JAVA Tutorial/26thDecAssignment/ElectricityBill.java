//Create a parameterized method that accepts units consumed and calculates the bill based on slab rates
//How will you handle boundary values: think
import java.util.*;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total units: ");
        int units=sc.nextInt();
        calculates(units);
        
    }
    public static void calculates(int units){
        int cost=0;
        if(units<=100){
            cost=units*2;
        }
        else if(units<=200){
            cost=100*2+(units-100)*3; // 100*2+35*3
        } else{
            cost=100*2+100*3+(units-200)*4;
        }
        System.out.println("Total bill for the month is: "+cost);   //235 = 100*2+100*3+35*4
    }
}
