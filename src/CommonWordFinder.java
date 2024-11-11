import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonWordFinder {
    public static final Pattern wordPattern = Pattern.compile("[а-яА-Я]+");
    public  static Set<String> findCommonWords(List<String> text){
        Set<String> commonWords = new TreeSet<>(Comparator.comparingInt(String::length));
        for(String part : text ){
            Set<String> words = new HashSet<>();
            Matcher matcher = wordPattern.matcher(part);
        while (matcher.find()){
            words.add(matcher.group().toLowerCase());
        }
        if(commonWords.isEmpty()){
            commonWords = new HashSet<>(words);
        }else{
            commonWords.retainAll(words);
        }
        }
        return commonWords;
    }


}
