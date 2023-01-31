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
        List<Integer> arr = new LinkedList<>(Arrays.asList(1,2,2,3,3,null,null,4,4));
        TreeNode root = new TreeNode(arr);
        root.printTreeNodeBFS();
        System.out.println(BalancedBinaryTree.isBalanced(root));
    }
}