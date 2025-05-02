import java.util.Scanner;

public class Q {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String i1 = input.nextLine();
        String i2 = input.nextLine();
        input.close();

        int h1 = Integer.parseInt(i1.substring(0,2));
        int m1 = Integer.parseInt(i1.substring(0,2))*60 + Integer.parseInt(i1.substring(3));
        int m2 = Integer.parseInt(i2.substring(0,2))*60 + Integer.parseInt(i2.substring(3));
        
        System.out.printf("%02d:%02d",((m1+m2)/2)/60,(((m1+m2)/2)-(((m1+m2)/2)/60*60)));
    }
}
