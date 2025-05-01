import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        input.nextLine();
        int[] n = new int[size];
        for(int i = 0 ; i< size ; i++)
        {
            n[i] = input.nextInt();
        }

        int sum = 0;

        for(int i = 0 ; i<size ; i++)
        {
            sum+=n[i];
        }

        System.out.println(sum);

    }
}
