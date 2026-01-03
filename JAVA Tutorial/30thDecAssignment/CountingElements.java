import java.util.Scanner;
public class CountingElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        boolean visited[]=new boolean[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter elements at "+i+" : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            int count=1;
            if(visited[i]){
                continue;
            }
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(arr[i]+" is appeared for : "+count+" times");
        }
            
        
    }
}
