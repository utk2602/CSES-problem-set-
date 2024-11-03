import java.util.Scanner;

public class prog5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the array
        int N = scanner.nextInt();
        
        // Read the first element
        long mx = scanner.nextLong();
        long sum = 0;
        
        // Iterate through the rest of the elements
        for (int i = 1; i < N; i++) {
            long x = scanner.nextLong();
            mx = Math.max(mx, x);
            sum += (mx - x);
        }
        
        // Print the result
        System.out.println(sum);
        
        scanner.close();
    }
}
