import java.util.Scanner;

public class GameWinner  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] cases = new int[t];
        for (int i = 0; i < t; i++) {
            cases[i] = sc.nextInt();
        }
        for (int i = 0; i < t; i++) {
            int n = cases[i];
            if (n % 3 == 0) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        }

        sc.close();
    }
}
