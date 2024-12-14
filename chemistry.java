import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            int n = in.nextInt();
            int k = in.nextInt();
            String s = in.next();
            Map<Character,Integer> map = new HashMap<>();
            for(char i : s.toCharArray()){
                map.put(i,map.getOrDefault(i, 0) + 1);
            }
            int odd=0;
            for(int val:map.values()){
                if(val%2!=0){
                    odd+=1;
                }
            }
            if(k<odd-1){
                System.out.println("no");
            }else{
                System.out.println("yes");
            }
        }
    }
}