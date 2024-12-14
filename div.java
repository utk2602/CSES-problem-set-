

// all the numbers should be only divisible by 2 or 3 if not then not happening
// number of (3)-number of(2)%2==0 if n ==1 and obv number of 3 >2 
// solved this one on my own lfggggg
import java.util.*;
public class div{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            int op=0;
            int three=0 ;int  two =0;
            int n = in.nextInt();
            while(n%2==0){
                n=n/2;
                two+=1;
            }while(n%3==0){
                n=n/3;
                three+=1;
            }
            if(n!=1){
                System.out.println(n);
            }
            else{
                op=(three-two)+three;
            }
            System.out.println(op);
        }
    }
}