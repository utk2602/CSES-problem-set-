import java.util.Scanner;
public class Tram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stops = scan.nextInt();
        int enter, out, i, rem = 0, max = 0;
        for (i = 0; i < stops; i++) {
            out = scan.nextInt();
            enter = scan.nextInt();
            if (i == 0) {
                rem = enter;
                max = rem;
            } else {
                rem += enter - out;
                max = Math.max(max, rem);
            }
        }
        System.out.println(max);
    }
}

//easy question just wanted to maintain the streak thats why i solved this 