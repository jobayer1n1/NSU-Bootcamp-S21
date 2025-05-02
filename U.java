import java.util.Scanner;

public class U {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        double k = (a+b)/(double)2;
        if(k!=(long)k){
            System.out.println("IMPOSSIBLE");
            System.exit(0);
        }
        System.out.println((long)k);
    }
}
