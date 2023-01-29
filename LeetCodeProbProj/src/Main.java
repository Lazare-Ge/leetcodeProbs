import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //ArrayList<String> arrStr = new ArrayList<>(Arrays.asList("ab","ba"));
        String[] arrStr = {"ab", "gg", "ba", "lc", "cl"};
        System.out.println(LongestPalindromeByConcatenatingTwoLetterWords.longestPalindrome(arrStr));
    }
}