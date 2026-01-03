import java.util.Arrays;

public class Arr1 {
    public static void main(String[] args) {
        //How many wayes we can print the array elements
        //1st way
        int arr1[]={1,2,3,4};
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        //2nd way
        System.out.println(Arrays.toString(arr1));
    }
}
