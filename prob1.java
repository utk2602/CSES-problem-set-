import java.util.Scanner;

public class prob1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long n = in.nextLong();
        System.out.print(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2; 
            } else {
                n = 3 * n + 1; 
            }
            System.out.print(" "+n);
        }
    }
}
