import java.util.Scanner;

public class X {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,d;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        int x = Math.abs(a-c);
        int y = Math.abs(b-d);
        System.out.println(Math.max(x, y));
    }
}
