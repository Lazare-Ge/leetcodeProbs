import java.util.ArrayList;
public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head){
        ListNode nodePtr1 = head;
        ListNode nodePtr2 = head;
        ListNode newHead = head;
        int count = 0;
        while(nodePtr2 != null && nodePtr2.next != null){
            nodePtr2 = nodePtr2.next.next;
            ListNode tmpNode = nodePtr1.next;
            nodePtr1.next = nodePtr1.next.next;
            tmpNode.next = newHead;
            newHead = tmpNode;
            count++;
        }
        count = count * 2;
        if(nodePtr2 != null) count++;
        System.out.println(count);
        if(count % 2 == 0){
            if(newHead.val != newHead.next.val) return false;
            nodePtr1 = newHead.next.next;
        }else{
            nodePtr1 = newHead.next;
        }
        while(nodePtr2 != null){
            if(nodePtr1.val != nodePtr2.val) return false;
            nodePtr1 = nodePtr1.next;
            nodePtr2 = nodePtr2.next;
        }
        return true;
    }
}
