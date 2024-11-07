import java.util.Scanner;

public class prog8 {
       static final int MAXN = 1000001;
       static final int MOD = 1000000007;
       static int[] DP = new int[MAXN];

       // Recursive function to compute the number of ways
       public static int compute(int left) {
              if (DP[left] != 0) {
                     return DP[left];
              }
              for (int i = 1; i <= 6; i++) {
                     if (left - i >= 0) {
                            DP[left] += compute(left - i);
                            DP[left] %= MOD;
                     }
              }
              return DP[left];
       }

       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              int n = sc.nextInt();

              // Initialize the DP array with zeros (default value in Java is 0 for int
              // arrays)
              DP[0] = 1; // base case: 1 way to reach 0 (do nothing)

              // Compute the result and print it
              System.out.println(compute(n));

              sc.close();
       }
}
