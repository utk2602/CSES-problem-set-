import java.util.*;

public class prog9 {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int steps = 0;
        
        while (n > 0) {
            int maxDigit = 0;
            int temp = n;
            
            while (temp > 0) {
                int digit = temp % 10;
                maxDigit = Math.max(maxDigit, digit);
                temp /= 10;
            }
            
            n -= maxDigit;
            steps++;
        }
        
        System.out.println(steps);
    }
}
