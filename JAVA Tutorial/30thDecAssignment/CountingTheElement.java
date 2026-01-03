import java.util.Scanner;
public class CountingTheElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int count=0;
        for(int i=0;i<size;i++){
            System.out.println("Enter elements at "+i+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter value to search in an array: ");
        int search=sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]==search){
                System.out.println(search+" is present at : "+i);
                count++;
            }
        }
        System.out.println(search+" is repeated for : "+count+" times");
    }
}
