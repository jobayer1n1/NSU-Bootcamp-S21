import java.util.Scanner;

public class E {

    public static void main(String[] args) {
        int n,m;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        m = n;
        int[][] arr= new int[n][m];
        for(int i = 0 ; i< n ; i++)
        {
            for(int j= 0 ; j< m;j++)
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
