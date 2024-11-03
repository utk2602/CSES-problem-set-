import java.util.*;
public class prog2 {
       public static void main(String[] Args){
            Scanner in = new Scanner(System.in);
            long n = in.nextLong();
            long s =0;
            for(long i =0 ; i < n-1;i++){
                int x =in.nextInt();
                s+=x;
            }
            System.out.println((n*(n+1))/2  -s);
      }
}
            