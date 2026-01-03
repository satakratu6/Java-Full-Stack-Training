import java.util.Scanner;

public class AscedingOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter elements at "+i+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Normal Array: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Array in ascending order: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
