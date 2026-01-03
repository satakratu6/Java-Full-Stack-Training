import java.util.Scanner;
public class MaxElementFromHalfs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int max1=0;
        int max2=0;
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter elements at "+i+" : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length/2;i++){
            
            if(arr[i]>max1){
                max1=arr[i];
            }
        }
         for(int i=arr.length/2;i<arr.length;i++){
            
            if(arr[i]>max1){
                max2=arr[i];
            }
        }

        System.out.println("Maximum elemnent from the first half in array: "+max1);
        System.out.println("Maximum elemnent from the second half in array: "+max2);

    }
}
