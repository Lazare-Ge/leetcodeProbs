import javax.naming.directory.SearchControls;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {0,1,2,3,4,5,6};
        TreeNode root = ConvertSortedArrayToBinarySearchTree.sortedArrayToBST(arr1);
    }
}