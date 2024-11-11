import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberFinder {
    public static final Pattern numberPattern = Pattern.compile("\\d+");

    public static Set<Integer> findNumbers(List<String> text){
        Set<Integer> numbers = new TreeSet<>();
        for (String part : text){

            Matcher matcher = numberPattern.matcher(part);
            while (matcher.find()){
                int num = Integer.parseInt(matcher.group());
                numbers.add(num);
            }
        }
        return numbers;
    }
}
