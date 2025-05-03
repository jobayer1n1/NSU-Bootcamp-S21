import java.util.Scanner;

public class V {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        long n;
        StringBuilder output = new StringBuilder();
        int steps;

        for (int i = 0 ;i<q ;i++){
            n = input.nextLong();
            steps=0;
            while(n>=2) {
                if ( n % 2 != 0 && n % 3 != 0 && n % 5 != 0 ) {
                    break;
                }
                while (n % 2 == 0) {
                    n /= 2;
                    steps++;
                }
                while (n % 3 == 0) {
                    n = (2 * n) / 3;
                    steps++;
                }
                while (n % 5 == 0) {
                    n = (4 * n) / 5;
                    steps++;
                }
            }
            if(n==1) output.append(steps).append("\n");
            else output.append(-1).append("\n");
        }

        System.out.println(output);
    }


}
