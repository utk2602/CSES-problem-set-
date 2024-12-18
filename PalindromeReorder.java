import java.util.Scanner;

public class PalindromeReorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();

        // Step 1: Frequency count
        int[] freq = new int[26];
        for (char c : input.toCharArray()) {
            freq[c - 'A']++;
        }

        // Step 2: Check for odd frequencies
        int oddCount = 0;
        char oddChar = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                oddCount++;
                oddChar = (char) (i + 'A');
            }
        }

        // If more than one character has an odd frequency, no solution is possible
        if (oddCount > 1) {
            System.out.println("NO SOLUTION");
            return;
        }

        // Step 3: Construct the palindrome
        char[] result = new char[input.length()];
        int left = 0;
        int right = input.length() - 1;

        for (int i = 0; i < 26; i++) {
            char currentChar = (char) (i + 'A');
            while (freq[i] > 1) {
                result[left++] = currentChar; // Place character at the left
                result[right--] = currentChar; // Place character at the right
                freq[i] -= 2; // Reduce frequency by 2
            }
        }

        // If there's an odd character, place it in the middle
        if (oddCount == 1) {
            result[left] = oddChar;
        }

        // Step 4: Output the result
        System.out.println(new String(result));
    }
}
