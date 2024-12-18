import java.util.*;
public class count{
    static int solve(int N){
        if(N==0){
            return 0;
        }
        return N/5 +solve(N/5);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        System.out.println(n/5);
    }
}