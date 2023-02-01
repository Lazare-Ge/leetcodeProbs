import javax.naming.directory.SearchControls;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {0,1,2,3,4,5,6};
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(5,3,6,2,4,null,null,1));
        TreeNode root = new TreeNode(arr2);
        KthSmallestElementInABST.kthSmallest(root, 3);
    }
}