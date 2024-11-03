import java.util.*;
public class prog4 {
public static void main(String[] Args){
Scanner in = new Scanner(System.in);
int n = in.nextInt();
if(n==1) System.out.println("1");
if(n<=3) System.out.println("No solution");
for(int i =1 ;  i <=n ;i+=2){
System.out.print(i+" ");
}
for(int i =2 ; i <=n;i+=2){
System.out.print(i+" ");
}
}}