import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = in.nextInt();
        }
        int[] ans = solve(heights);
        System.out.println(ans[0] + " " + ans[1]);
        in.close();
    }

    public static int[] solve(int[] val) {
        int[] index = new int[2];
        int min = Math.abs(val[val.length - 1] - val[0]);
        index[0] = 1;
        index[1] = val.length;

        for (int i = 0; i < val.length - 1; i++) {
            if (Math.abs(val[i] - val[i + 1]) < min) {
                min = Math.abs(val[i] - val[i + 1]);
                index[0] = i + 1;
                index[1] = i + 2;
            }
        }
        return index;
    }
}
