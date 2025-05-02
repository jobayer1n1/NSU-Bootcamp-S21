import java.util.Scanner;


public class P {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a,b;
        StringBuilder output = new StringBuilder();
        int n = input.nextInt();
        for(int i = 0 ; i< n ; i++)
        {
            a = input.nextInt();
            if(a > (b=input.nextInt())) output.append(">\n");
            else if(a<b) output.append("<\n");
            else output.append("=\n");
        }
        System.out.println(output);
    }
}

