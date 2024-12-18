import java.util.Scanner;

public class KnightsProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        StringBuilder result = new StringBuilder();
        for (int k = 1; k <= n; k++) {
            long tw= (long) k * k * (k * k - 1) / 2; // Total ways to place two knights
            long attp = 0;

            if (k > 2) {
                attp = 4L * (k - 1) * (k - 2); // Count of attacking positions
            }

            long nonw = tw - attp;
            result.append(nonw).append("\n");
        }

        System.out.print(result);
    }
}
