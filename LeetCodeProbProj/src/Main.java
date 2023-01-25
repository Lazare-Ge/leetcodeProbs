import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nodeVals = new ArrayList<>(List.of(1,2,2,3,1));
        ListNode head = new ListNode(nodeVals);
        System.out.println(PalindromeLinkedList.isPalindrome(head));
    }
}