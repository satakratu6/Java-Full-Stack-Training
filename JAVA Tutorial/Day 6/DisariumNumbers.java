import java.util.*;
public class DisariumNumbers {
    public static void main(String[] args) {
              
        for(int i=0;i<200;i++){
            int count = 0;
            int temp = i;        
            int sum = 0;
            while (temp > 0) {
            count++;
            temp /= 10;
        }
            temp = i;
            while (temp > 0) {
            int dig = temp % 10;
            int power = 1;

            for (int j = 0; j < count; j++) {
                power *= dig;
            }
            sum += power;
            count--;
            temp /= 10;
            
        }
            if (sum == i) {
            System.out.println(i + " is a Disarium Number");
        }
        }
      
         
    }
}
