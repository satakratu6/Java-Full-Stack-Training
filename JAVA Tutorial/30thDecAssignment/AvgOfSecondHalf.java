import java.util.Scanner;
public class AvgOfSecondHalf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entet the size of array: ");
        int arr[]=new int[sc.nextInt()];
        double sum=0;
        double avg=1;
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element at "+i+" : ");
            arr[i]=sc.nextInt();
        }
        for(int i=arr.length/2;i<arr.length;i++){
            sum+=arr[i];
        }
        avg=sum/(arr.length-arr.length/2);
        System.out.println("Average of first half from array: "+avg);
        sc.close();
    }
}
