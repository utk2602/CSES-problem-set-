import java.util.Scanner;

public class prog6 {
    static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(fastPow2(N));
        scanner.close();
    }

    static long fastPow2(int x) {
        long res = 1;
        long a = 2;
        while (x > 0) {
            if ((x & 1) == 1) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            x >>= 1;
        }
        return res;
    }
}
