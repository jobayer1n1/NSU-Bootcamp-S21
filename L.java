import java.util.Scanner;

public class L {
    public static int indexOfDiffer(int[] arr)
    {
        int size = arr.length;
        int flag=1,oddCount =0;
        for(int x: arr)
        {
            if(x%2!=0) oddCount++;
            if(oddCount>1) {
                flag = 0;
                break;
            }
        }
        if(flag==0){
            for(int i = 0 ; i<size ; i++){
                if(arr[i]%2==0) return i+1;
            }
        }
        else{
            for (int i = 0 ; i<size ; i++){
                if(arr[i]%2!=0) return i+1;
            }
        }
        return 1;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i< n ; i++){
            arr[i] = input.nextInt();
        }
        int index = indexOfDiffer(arr);
        System.out.println(index);
    }

}

