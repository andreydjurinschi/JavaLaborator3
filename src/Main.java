import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<String> text = new ArrayList<>();
        try {
            text = FileReader.readFile("text.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        Set<String> commonWords = CommonWordFinder.findCommonWords(text);
        Set<Integer> numbersSet = NumberFinder.findNumbers(text);

        StringBuffer output = new StringBuffer();
        output.append("Множества слов: ").append(commonWords).append("\n")
                .append("Числа в тексте: ").append(numbersSet);

        System.out.println(output);
    }
}
