import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        int[] arr = new int[size];

        for(int i = 0 ; i< size ;i++)
        {
            arr[i]=input.nextInt();
        }
        plusMinus(arr);
    }
    static void plusMinus(int[] arr){
        int size = arr.length;
        int positives =0 ,negatives= 0 ,zeroes = 0;

        for (int j : arr) {
            if (j < 0) negatives++;
            else if (j > 0) positives++;
            else zeroes++;
        }
        double rP = positives/(double)size;
        double rN = negatives/(double)size;
        double rZ = zeroes/(double)size;

        System.out.printf("%.6f\n",rP);
        System.out.printf("%.6f\n",rN);
        System.out.printf("%.6f\n",rZ);
    }
}
