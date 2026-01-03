import java.util.Scanner;
public class Arr3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int arr[]=new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter elements: "+(i+1));
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
