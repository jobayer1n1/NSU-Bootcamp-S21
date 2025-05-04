import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Z {
    static ArrayList<String> words;
    public static void removeDuplicate(){
        Set<String> uniqueWords = new LinkedHashSet<>(words);
        words.clear();
        words.addAll(uniqueWords);
        uniqueWords.clear();
    }
    public static void dictionary(String filePath) throws FileNotFoundException {
        words = new ArrayList<>();
        File file = new File(filePath);
        Scanner inputLine = new Scanner(file);
        while(inputLine.hasNext()){
            words.add((inputLine.next().replaceAll("[^a-zA-Z]+", "")).toLowerCase());
        }
        Z.removeDuplicate();
        Collections.sort(words);
        for(String string:words){
            System.out.println(string);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        dictionary("C:\\Users\\jobay\\IdeaProjects\\BootCamp\\src\\sample.txt");
    }

}
