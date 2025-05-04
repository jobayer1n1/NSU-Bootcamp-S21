import java.util.Scanner;

public class E {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[][] arr= new int[n][n];
        for(int i = 0 ; i< n ; i++)
        {
            for(int j= 0 ; j< n;j++)
            {
                arr[i][j] = input.nextInt();
            }
        }

        int answer = diagonalDifference(arr);
        System.out.println(answer);

    }

    static int diagonalDifference(int[][] arr){
        int sumPrimary = 0, sumSecondary = 0;
        int n = arr.length;
        for(int i = 0, j= n-1 ; i<n ; i++,j--)
        {
            sumPrimary+=arr[i][i];
            sumSecondary+= arr[i][j];
        }
        return Math.abs(sumPrimary-sumSecondary);
    }
}
