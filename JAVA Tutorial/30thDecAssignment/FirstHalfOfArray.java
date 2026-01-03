import java.util.Scanner;
public class FirstHalfOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entet the size of array: ");
        int arr[]=new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element at "+i+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("First half of the array: ");
        for(int i=0;i<arr.length/2;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
