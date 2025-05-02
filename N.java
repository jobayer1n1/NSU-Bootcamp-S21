import java.util.Scanner;


public class N {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        int n = input.nextInt();
        int a,b,c;
        for(int i = 0 ;i<n ; i++){
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
            if((c/(double)(a*b)*100)> 50){
                output.append("YES\n");
            }
            else
            {
                output.append("NO\n");
            }
        }
        System.out.println(output);
    }
}

