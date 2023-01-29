import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(3,3,3,4,5));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(13,12,10,-1,15,-90, -7, 9, 8, 1, 1, 100));
        ListNode head1 = new ListNode(arr1);
        ListNode head2 = new ListNode(arr2);
        SortList.sortList(head2).printListNode();
    }
}