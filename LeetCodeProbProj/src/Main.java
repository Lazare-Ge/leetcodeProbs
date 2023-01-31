import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //ArrayList<String> arrStr = new ArrayList<>(Arrays.asList("ab","ba"));
        //String[] arrStr = {"ab", "gg", "ba", "lc", "cl"};
        //char[] chars = {'A','A','A','B','B','B','C','C','D','E', 'F','G'};
        //Queue<Integer> lst = new LinkedList<>();
        List<Integer> arr = new LinkedList<>(Arrays.asList(5,4,8,11,null,13,4,7,2,null,null,5,1));
        TreeNode root = new TreeNode(arr);
        root.printTreeNodeBFS();
        //System.out.println(PathSumIII.pathSum(root, 22));
        System.out.println(Integer.MAX_VALUE);
    }
}