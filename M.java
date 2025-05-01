import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;


public class M {
    public static void hajjEAkbar() throws IOException {
        StringBuilder lineInput = new StringBuilder();
        StringBuilder output = new StringBuilder();
        Reader reader = new InputStreamReader(System.in);
        char c = (char)reader.read();
        int casE =1;
        while(c!='*')
        {
            c = (char)reader.read();
            if(c=='\n') {
                output.append("Case ").append(casE).append(": ");
                if(lineInput.toString().equals("Hajj")){
                    output.append(("Hajj-e-Akbar") + "\n");
                }
                else{
                    output.append(("Hajj-e-Asghar") + "\n");
                }
                lineInput = new StringBuilder();
                casE++;
                continue;
            }
            lineInput.append(c);
        }
        reader.close();

        System.out.println(output);

    }

    public static void main(String[] args) throws IOException {
        hajjEAkbar();
    }
}

