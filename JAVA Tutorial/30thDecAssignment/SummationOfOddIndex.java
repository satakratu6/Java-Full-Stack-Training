import java.util.Scanner;
public class SummationOfOddIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int arr[]=new int[sc.nextInt()];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter element for  : "+i+" : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
            sum+=arr[i];}
        }
        System.out.println("Summation of odd index elements in Array is: "+sum);
    }
}
