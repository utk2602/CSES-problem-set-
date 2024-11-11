import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class prog11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values for n (array size) and x (target sum)
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        
        // Initialize the array and map
        int[] array = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        
        // Read array values
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Process each element to find a pair with the sum x
        for (int i = 0; i < n; i++) {
            int complement = x - array[i];
            
            // Check if the complement is already in the map
            if (map.containsKey(complement)) {
                // Found the two values whose sum is x
                System.out.println((map.get(complement) + 1) + " " + (i + 1));
                scanner.close();
                return;
            }
            
            // Store the current element with its index
            map.put(array[i], i);
        }
        
        // If no pair found, print "IMPOSSIBLE"
        System.out.println("IMPOSSIBLE");
        scanner.close();
    }
}
