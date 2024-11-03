import java.util.*;
public class prog3{
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        String s =in.next();
        int c=1;
        int max =1;
        for(int i =1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c+=1;
            }else{
                c=1;
            }
            max =Math.max(max,c);
        }
        System.out.println(max);
    }
}