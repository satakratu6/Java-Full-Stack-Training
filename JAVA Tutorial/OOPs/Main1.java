import java.util.Scanner;
class Ola{
	public String userName;
	public long contactNumber;
	private double userAccBal;
	Ola ( String userName, long contactNumber, double userAccBal){
		this.userName=userName;
		this.contactNumber=contactNumber;
		this.userAccBal=userAccBal;
	}
    public boolean login(){
        if(userName.equals("Satakratu")){
            return true;
        } else{
            return false;
        }
    }
}
class Mini extends Ola{
    private String pickup;
    private String drop;
    private int price;
    private double pkm;
    Mini(String userName, long contactNumber, double userAccBal, String pickup, String drop, int price, double pkm){
       super(userName, contactNumber, userAccBal);
       this.pickup=pickup;
       this.drop=drop;
       this.price=price;
       this.pkm=pkm;
    }
     public void bookCab(String pickup, String drop){
        System.out.println("The pickup address: "+pickup);
        System.out.println("The drop address: "+drop);
    }
    public void displayDetails(){
        System.out.println("Customer Name: "+userName);
        System.out.println("Contact Numbe: "+contactNumber);
        System.out.println("Cost Per KM "+pkm);
    }
     public Ola cancelRide(){
        System.out.println("Cancelling the ride: ");
        return null;
    } 
   

}
class Prime extends Ola{
    private String pickup;
    private String drop;
    private int price;
    private double pkm;
    Prime(String userName, long contactNumber, double userAccBal, String pickup, String drop, int price,double pkm){
       super(userName, contactNumber, userAccBal);
       this.pickup=pickup;
       this.drop=drop;
       this.price=price;
       this.pkm=pkm;
    } 
     public void bookCab(String pickup, String drop){
        System.out.println("The pickup address: "+pickup);
        System.out.println("The drop address: "+drop);
    }
    public void displayDetails(){
        System.out.println("Customer Name: "+userName);
        System.out.println("Contact Numbe: "+contactNumber);
        System.out.println("Cost Per KM "+pkm);
    }
     public Ola cancelRide(){
        return null;
    }
    
}

class Luxury extends Ola{
    private String pickup;
    private String drop;
    private int price;
    private double pkm;
    Luxury(String userName, long contactNumber, double userAccBal, String pickup, String drop, int price, double pkm){
       super(userName, contactNumber, userAccBal);
       this.pickup=pickup;
       this.drop=drop;
       this.price=price;
       this.pkm=pkm;
    } 
    public void bookCab(String pickup, String drop){
        System.out.println("The pickup address: "+pickup);
        System.out.println("The drop address: "+drop);
    }
    public void displayDetails(){
        System.out.println("Customer Name: "+userName);
        System.out.println("Contact Numbe: "+contactNumber);
        System.out.println("Cost Per KM "+pkm);
    }
    public Ola cancelRide(){
        System.out.println("Cancelling the ride");
        return null;
    }
    
}
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write your userName: ");
        String userName=sc.nextLine();
        System.out.println("Write your contactNumber: ");
        long contactNumber=sc.nextLong();
        System.out.println("Write your Account Balance: ");
        double userAccBal=sc.nextDouble();
        Ola ola=new Ola(userName, contactNumber, userAccBal);
        boolean loginSuc=ola.login();
         if(loginSuc){
            sc.nextLine();

            System.out.println("Succefully logged in");
            System.out.println("Write your Pickup location :");
            String pickup=sc.nextLine();
            System.out.println("Write your drop location: ");
            String drop=sc.nextLine();
            System.out.println("Now write your choices for options: \n1 - Mini\n2 - Prime\n3 - Luxury");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    Ola o=new Mini(userName, contactNumber, userAccBal, pickup, drop,1200,4.5);
                    if(o instanceof Mini){
                    Mini m=(Mini) o;
                    m.bookCab(pickup, drop);
                    m.displayDetails();
                    sc.nextLine();

                    System.out.println("Do you want cancel the ride?");
                    String decision=sc.nextLine();
                    if(decision.equals("Yes")){
                        o=m.cancelRide();
                    }
                    } {
                        
                    }
                break;
                case 2:
                    Ola o1=new Prime(userName, contactNumber, userAccBal, pickup, drop,1200,7);
                    if(o1 instanceof Prime){
                    Prime m=(Prime) o1;
                    m.bookCab(pickup, drop);
                    m.displayDetails();
                    sc.nextLine();

                    System.out.println("Do you want cancel the ride?");
                    String decision=sc.nextLine();

                    if(decision.equals("Yes")){
                        o1=m.cancelRide();
                    }
                    }
                    break;
                case 3:
                    Ola o3=new Luxury(userName, contactNumber, userAccBal, pickup, drop,1200,10);
                    if(o3 instanceof Luxury){
                    Luxury m=(Luxury) o3;
                    m.bookCab(pickup, drop);
                    m.displayDetails();
                    sc.nextLine();
                    System.out.println("Do you want cancel the ride?");
                    String decision=sc.nextLine();

                    if(decision.equals("Yes")){
                        o=m.cancelRide();
                    }
                    }
                break;
                case 4:
                default:
                    System.out.println("Wrong option!!!");
                    
            }
        } else{
            System.out.println("Can't log in");
        }            
   }
}
