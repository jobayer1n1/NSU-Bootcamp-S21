
import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        int[]arr = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i=0 ; i< 5 ;i++)
        {
            arr[i] = input.nextInt();
        }
        miniMaxSum(arr);
    }

    public static void miniMaxSum(int[] arr)
    {
        long miniSum= arr[1]+arr[2]+arr[3]+arr[4], maxSum= arr[1]+arr[2]+arr[3]+arr[4],miniFlag=0L,maxFlag=0L;
        for(int i = 0 ; i< arr.length ; i++,miniFlag=0L,maxFlag=0L){
            for(int j = 0; j<arr.length ;j++){
                if(j!=i){
                	miniFlag += arr[j];
                	maxFlag += arr[j];
                }
            }
            if(miniFlag<miniSum) miniSum=miniFlag;
            if(maxFlag>maxSum) maxSum = maxFlag;
        }
        System.out.printf("%d %d", miniSum,maxSum);
    }

}

