import java.util.Scanner;
public class AvgOfEvenIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int arr[]=new int[sc.nextInt()];
        int sum=0;
        double avg=1;
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter element for  : "+i+" : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
            sum+=arr[i];
        }
        }
        avg=(double)(sum/arr.length);
        System.out.println("Average of even index elements in Array is: "+avg);
    }
}
