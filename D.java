import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        int[] a = new int[3];
        Scanner input = new Scanner(System.in);

        for(int i = 0 ; i<3; i++){
            a[i]=input.nextInt();
        }
        int[] b = new int[3];
        for(int i = 0 ; i<3; i++){
            b[i]=input.nextInt();
        }
        int[] answer =  compareTriplets(a,b);
        System.out.println(answer[0]+" "+answer[1]);
    }
    static int[]  compareTriplets(int[] a ,int[] b)
    {
        int aa=0,bb=0;
        for(int i = 0 ; i< 3; i++)
        {
            if(a[i]>b[i]){
                aa++;
            }
            else if(b[i]>a[i]){
                bb++;
            }
        }

        return new int[]{aa,bb};
    }

}
