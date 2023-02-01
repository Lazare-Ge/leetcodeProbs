import javax.naming.directory.SearchControls;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //int[] arr1 = {0,1,2,3,4,5,6};
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(7,3,15,null,null,9,20));
        TreeNode root = new TreeNode(arr2);
        BSTIterator bstIt = new BSTIterator(root);
        System.out.println(bstIt.next());
        System.out.println(bstIt.next());
        System.out.println(bstIt.next());
        System.out.println(bstIt.next());
        System.out.println(bstIt.next());
        System.out.println(bstIt.next());
    }
}