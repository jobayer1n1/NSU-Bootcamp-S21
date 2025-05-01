
import java.util.Scanner;

public class J {
    public static String timeConversion(String s)
    {
        String tmp = "%02d",convertedString ="";
        String flag = s.substring(8,10);
        int hours = Integer.parseInt(s.substring(0,2));

        if(flag.equals("AM"))
        {
            if(hours==12) hours=0;
        }
        else if("PM".equals(flag)){
            if(hours!=12){
                hours+=12;
            }
        }
        convertedString = String.format(tmp, hours)+s.substring(2,8);
        return convertedString;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = timeConversion(input.nextLine());
        System.out.println(answer);
    }
}

