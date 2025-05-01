import java.util.Scanner;

public class C {
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

        long sum = 0L;

        for(int i = 0 ; i<size ; i++)
        {
            sum+=n[i];
        }

        System.out.println(sum);

    }
}
