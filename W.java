import java.util.Scanner;

public class W {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a,b,n = input.nextInt();
        StringBuilder output = new StringBuilder();
        for(int i = 0 ;i< n ; i++){
            a = input.nextInt();
            b = input.nextInt();
            output.append(a-((a/(b+1))*b)).append("\n");
        }
        System.out.println(output);
    }
}
