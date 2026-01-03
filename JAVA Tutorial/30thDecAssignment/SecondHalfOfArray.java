import java.util.Scanner;
public class SecondHalfOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entet the size of array: ");
        int arr[]=new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element at "+i+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Second half of the array: ");
        for(int i=arr.length/2;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
