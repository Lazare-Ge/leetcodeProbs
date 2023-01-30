import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //ArrayList<String> arrStr = new ArrayList<>(Arrays.asList("ab","ba"));
        //String[] arrStr = {"ab", "gg", "ba", "lc", "cl"};
        char[] chars = {'A','A','A','B','B','B','C','C','D','E', 'F','G'};
        TaskScheduler.leastInterval(chars, 5);
    }
}