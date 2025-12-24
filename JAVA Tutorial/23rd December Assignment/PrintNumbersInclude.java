import java.util.Scanner;

public class PrintNumbersInclude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i = m; i < n; i++) {
            int temp = i;
            boolean hasFive = false;

            while (temp > 0) {
                int digit = temp % 10;
                if (digit == 5) {
                    hasFive = true;
                    break;
                }
                temp /= 10;
            }

            if (hasFive) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
