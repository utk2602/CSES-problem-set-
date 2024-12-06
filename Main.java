import java.util.*;

public class Main {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i =0 ; i < t ; i ++){
            int  n = in.nextInt();
            String ans ="no";
            int[] arr = new int[n];int s1=0;int s2=0;int s =0;
            for(int j =0 ; j < n ;  j ++){
                arr[j]=in.nextInt();
                if(j%2==0){
                    s1+=arr[j];
                }else{
                    s2+=arr[j];
                }
                s+=arr[j];
            }
            int odd =0,even=0;
            if(s%n==0){
                odd=(n+1)/2;
                even=n-odd;
                s/=n;
                if(s1== odd*s && s2==even*s){
                    ans="yes";
                }
            }
            System.out.println(ans);
        }
    }
}
