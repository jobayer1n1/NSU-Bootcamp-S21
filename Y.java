import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Y {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        String[] sNumbers =input.split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();
        StringBuilder output = new StringBuilder();

        for (String sNumber : sNumbers) {
            numbers.add(Integer.parseInt(sNumber));
        }
        int k ;
        for(int i  = 0; i<numbers.size();i++){
            k=1;
            for(int j = i+1 ;j<numbers.size() ;){
                if (Objects.equals(numbers.get(i), numbers.get(j))) {
                    numbers.remove(j);
                    k++;
                } else {
                    j++;
                }
            }
            output.append(numbers.get(i)).append(" ").append(k).append("\n");
        }
        System.out.println(output);

    }
}
