import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        stairCase(n);
    }

    public static void stairCase(int n)
    {
        for(int i = 0,j = n; i< n ; i++,j--)
        {
            for(int k = 0 ; k < j-1 ; k++)
            {
                System.out.print(" ");
            }
            for(int k = 0 ; k < n-j+1;k++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
