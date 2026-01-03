import java.util.Scanner;
public class PrintOddndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int arr[]=new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter element for  : "+i+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Printing only odd indexes: ");
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
            System.out.println("Index "+i+" : "+arr[i]+" ");
        } }
    }
}
