
import java.util.Scanner;

public class K {
    public static String willMeet(int x1,int v1,int x2, int v2)
    {
        if(x1>x2 && v1<v2) return "YES";
        else if(x2>x1 && v2<v1) return "YES";
        else return "NO";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int v1 = input.nextInt();
        int x2 = input.nextInt();
        int v2 = input.nextInt();
        System.out.println(willMeet(x1,v1,x2,v2));
    }

}

