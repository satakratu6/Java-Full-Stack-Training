import java.util.Scanner;
public class CheckingValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter elements at "+i+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter value to search in an array: ");
        int search=sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]==search){
                System.out.println(search+" is present at : "+i);
            }
        }
    }
}
