import java.util.Scanner;
public class ReplacingElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter elements at "+i+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter in which index you want to replace: ");
        int pos=sc.nextInt();
        System.out.println("Enter the value you want to replace: ");
        int val=sc.nextInt();
        for(int i=0;i<size;i++){
            arr[pos]=val;
        }
        System.out.println("Elements in the array are: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
