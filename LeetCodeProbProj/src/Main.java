import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1));
        ListNode head = new ListNode(arr);
        head.printListNode();
        OddEvenLinkedList.oddEvenList(head);
        head.printListNode();
    }
}