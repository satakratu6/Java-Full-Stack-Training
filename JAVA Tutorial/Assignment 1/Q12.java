
public class Q12 {
    public static void main(String[] args) {
        double Prinicipleamount=500000;
        double rate=10.0;
        int time=5;
        int TotalMonths=time*12;
        double SI=(Prinicipleamount*rate*time)/100;
        double MonthlyEMI=(Prinicipleamount+SI)/TotalMonths;
        System.out.println("Principal Amount is: "+Prinicipleamount);
        System.out.println("Interest Rate Per Month: "+rate);
        System.out.println("Total Months to be paid for: "+TotalMonths);
        System.out.println("EMI Per month is: "+MonthlyEMI);
    }
}
