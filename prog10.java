import java.util.*;

public class prog10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> distinctValues = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            distinctValues.add(value);
        }
        
        System.out.println(distinctValues.size());
    }
}
