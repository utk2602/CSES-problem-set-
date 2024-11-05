import java.util.Scanner;

public class porg7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // Check the conditions
            if ((a + b) % 3 == 0 && 2 * a >= b && 2 * b >= a) {
                result.append("YES\n");
            } else {
                result.append("NO\n");
            }
        }

        // Output all results at once for efficiency
        System.out.print(result.toString());
        sc.close();
    }
}
