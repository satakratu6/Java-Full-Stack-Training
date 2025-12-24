import java.util.Scanner;

public class PrintNumbersExclude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i = m; i < n; i++) {
            int temp = i;
            boolean hasSeven = false;

            while (temp > 0) {
                int digit = temp % 10;
                if (digit == 7) {
                    hasSeven = true;
                    break;
                }
                temp /= 10;
            }

            if (!hasSeven) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
