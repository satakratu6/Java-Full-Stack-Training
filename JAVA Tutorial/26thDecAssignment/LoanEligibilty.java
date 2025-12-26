//Design a method that accepts monthly income, credit score, and loan amount and returns eligibility status
import java.util.Scanner;

public class LoanEligibilty {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter total applications going on now: ");
        int app=sc.nextInt();
        if(app>=1 && app<=9){
        System.out.print("Enter monthly income: ");
        double monthlyIncome = sc.nextDouble();
        System.out.print("Enter credit score: ");
        int creditScore = sc.nextInt();
        System.out.print("Enter loan amount: ");
        double loanAmount = sc.nextDouble();

        isEligible(monthlyIncome,creditScore,loanAmount);
        } else{
            System.out.println("You have already applied for more than 10 applications");
        }
    }

    public static void isEligible(double monthlyIncome,int creditScore,double loanAmount){
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        if(monthlyIncome >= 100000 ){
            if(creditScore >= 700 && loanAmount <= 700000){
                System.out.println( "Eligible for loan");
            }
            else if((creditScore >= 500 && creditScore < 700) && loanAmount <= 500000){
               System.out.println( "Eligible for loan");
            }
            else{
                flag=false;
                System.out.println("Not eligible");
            }
        }
        else if(monthlyIncome >= 80000 && monthlyIncome < 100000){
            if(creditScore >= 700 && loanAmount <= 500000){
                System.out.println("Eligible for loan");
            }
            else if((creditScore >= 500 && creditScore < 700) && loanAmount <= 300000){
                System.out.println("Eligible for loan");
            }
            else{
                System.out.println("Not eligible");
                flag=false;
            }
            
        }
        else if(monthlyIncome >= 50000 && monthlyIncome < 80000){
            if(creditScore >= 700 && loanAmount <= 300000){
                System.out.println("Eligible for loan");
            }
            else if((creditScore >= 500 && creditScore < 700) && loanAmount <= 200000){
                System.out.println("Eligible for loan");
            }
            else{
                System.out.println("Not eligible");
                flag=false;
            }
            
        }
        else if(monthlyIncome >= 30000 && monthlyIncome < 50000){
            if(creditScore >= 700 && loanAmount <= 150000){
                System.out.println("Eligible for loan");
            }
            else if(creditScore < 700 && loanAmount <= 125000){
                System.out.println("Eligible for loan");
            }
            else{
                System.out.println("Not eligible");
                flag=false;
            }
            
        }
        else{
            System.out.println("Not Eligible for loan");
            flag=false;
        }
        if(flag){
            System.out.println("Enter the months to be applying: ");
            int months=sc.nextInt();
            System.out.println("Enter interest rate: ");
            double rate=sc.nextDouble();
            double SI=(loanAmount*rate*months)/100;
            double monthlyEMI=(loanAmount+SI)/months;
            System.out.println("The payment has to be done per months at "+rate+" interest rate is: "+monthlyEMI);
        }
        
    }
}