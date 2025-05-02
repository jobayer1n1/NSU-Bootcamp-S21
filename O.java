import java.util.Scanner;


public class O {
    public static void main(String[] args) {
        new Scanner(System.in).findAll("(\\d+) (\\d+) (\\d+) (\\d+) (\\d+) (\\d+) (\\d+) (\\d+)").forEach(result -> {
            int n = Integer.parseInt(result.group(1));
            int k = Integer.parseInt(result.group(2));
            int l = Integer.parseInt(result.group(3));
            int c = Integer.parseInt(result.group(4));
            int d = Integer.parseInt(result.group(5));
            int p = Integer.parseInt(result.group(6));
            int nl = Integer.parseInt(result.group(7));
            int np = Integer.parseInt(result.group(8));
            System.out.println((int)(min((int)((k*l)/(double)nl),c*d,(int) (p/(double)np))/(double)n));
            System.exit(0);
        });
    }
    public static int min(int a,int b,int c){
        if(a<b&&a<c)return a;
        else if(b<a && b<c)return b;
        else return c;
    }
}

