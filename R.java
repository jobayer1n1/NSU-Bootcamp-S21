import java.util.Scanner;

public class R {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder output = new StringBuilder();

        int c = input.nextInt();
        int L;
        for(int i = 0; i<c ; i++){
            L = input.nextInt();
            output.append(String.format("%.2f %.2f\n", 3.1426*L/(double)5*L/(double)5, (L*L*3/(double)5-3.1426*L/(double)5*L/(double)5)));
        }
        System.out.println(output);
    }
}
