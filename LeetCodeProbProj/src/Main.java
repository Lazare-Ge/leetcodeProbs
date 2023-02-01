import javax.naming.directory.SearchControls;
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
        //List<Integer> arr = new LinkedList<>(Arrays.asList(5,4,8,11,null,13,4,7,2,null,null,5,1));
        //TreeNode root = new TreeNode(arr);
        //System.out.println(PathSumIII.pathSum(root, 22));
        //int[][] matrix = {
        //        { 0, 1, 2, 3, 4, 5},
        //        { 6, 7, 8, 9,10,11},
        //        {12,13,14,15,16,17},
        //        {18,19,20,21,22,23},
        //        {24,25,26,27,28,29},
        //};
        //System.out.println(SearchA2DMatrix.searchMatrix(matrix, -1));
        int[] arr1 = {0,1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5,0};
        int[] arr3 = {2,3,4,5,0,1};
        int[] arr4 = {3,4,5,0,1,2};
        int[] arr5 = {4,5,0,1,2,3};
        int[] arr6 = {5,0,1,2,3,4};
        int[] arr7 = {4,5,6,7,8,1,2,3};
        //SearchInRotatedSortedArray.search(arr1, 8);
        //SearchInRotatedSortedArray.search(arr2, 8);
        //SearchInRotatedSortedArray.search(arr3, 8);
        //SearchInRotatedSortedArray.search(arr4, 8);
        //SearchInRotatedSortedArray.search(arr5, 8);
        //SearchInRotatedSortedArray.search(arr6, 8);
        System.out.println(SearchInRotatedSortedArray.search(arr7, 8));
    }
}