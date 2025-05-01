
import java.util.Scanner;

public class I {
   static int birthdayCakeCandles(int[] candles)
   {
       int tallest = candles[0];
       for (int candle : candles) {
           if (candle > tallest) tallest = candle;
       }
       int count = 0;
       for(int x : candles) if(x==tallest) count++;
       return count;
   }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[] candles = new int[n];
        for(int i = 0 ;i<n ; i++){
            candles[i] = input.nextInt();
        }
        int ans = birthdayCakeCandles(candles);
        System.out.println(ans);
    }
}

