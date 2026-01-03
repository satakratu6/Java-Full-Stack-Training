import java.util.Scanner;
public class MaxElementArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int max=0;
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter elements at "+i+" : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum elemnent from the array: "+max);
    }
}
