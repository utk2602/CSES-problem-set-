//My first div2 contest aiming to solve 1-2 questions as well as getting a rank lower than 10k 
//lessggooo

/*logic 
   the question seems confusing   according to my theory it should be saying yes 
 */

 import java.util.*;

 class Main {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int t = in.nextInt();
         while (t-- > 0) {
             int n = in.nextInt();
             int k = in.nextInt();
             int[] arr = new int[n];
             for (int j = 0; j < n; j++) {
                 arr[j] = in.nextInt();
             }
 
       
             boolean found = false;
             int chosenIndex = -1;
 
             for (int i = 0; i < n; i++) {
                 boolean valid = true;
                 for (int j = 0; j < n; j++) {
                     if (i != j && Math.abs(arr[i] - arr[j]) % k == 0) {
                         valid = false;
                         break;
                     }
                 }
                 if (valid) {
                     found = true;
                     chosenIndex = i + 1;
                     break;
                 }
             }
 
             if (found) {
                 System.out.println("YES");
                 System.out.println(chosenIndex);
             } else {
                 System.out.println("NO");
             }
         }
         in.close();
     }
 }
 




//probably the simplest that i could have expected in the contest 



//2

// this one also looks a bit absurd i am not able to find the logic used behind this 
//Maybe a 2 pointer approach will help 

// idk giving up at 9:25

