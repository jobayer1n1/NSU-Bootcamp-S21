import java.util.Scanner;

public class T {
    public static void main(String[] args) {
        String input = String.valueOf(new Scanner(System.in).nextLong());

        for(int i = 0 ; i<input.length();i++){
            if(input.charAt(i)!='4'&&input.charAt(i)!='7') {
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");

    }
}
