// Make it beautiful array 
I am kinda struggling with it kyuki i can easily tell if the array given at first is ugly or not but i dont know what to do after that
one key observation if all the elements are equal then array will always be ugly since u wont be able to reorder it 
One thing i have in my mind is if i place a number bigger than the next one , then the sum can never be equal 
okayy so we just have to make sure that the second element is not the culprit



so the code is 
import java.util.*;
public class Beautiful {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = in.nextInt(); // Size of the array
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            
            // Find the index of the maximum element
            int maxIdx = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] > arr[maxIdx]) {
                    maxIdx = i;
                }
            }
            
            // Place the max element at index 0
            int temp = arr[0];
            arr[0] = arr[maxIdx];
            arr[maxIdx] = temp;
            
            // Ensure the first two elements are distinct
            if (n > 1 && arr[0] == arr[1]) {
                boolean swapped = false;
                for (int i = 2; i < n; i++) {
                    if (arr[i] != arr[0]) {
                        // Swap arr[1] with arr[i]
                        temp = arr[1];
                        arr[1] = arr[i];
                        arr[i] = temp;
                        swapped = true;
                        break;
                    }
                }
                
                // If no suitable element found, print NO
                if (!swapped) {
                    System.out.println("NO");
                    continue;
                }
            }
            
            // Print the resulting array
            System.out.println("YES");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
 