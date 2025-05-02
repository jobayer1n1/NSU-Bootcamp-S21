import java.util.Scanner;

public class S {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int oddity= 0;
        for(int i = 0 ,j; i< n ; i++){
            j = input.nextInt();
            if(j!=i+1) oddity++;
            if(oddity>2) {
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }
}
