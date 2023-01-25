public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head){
        ListNode newHead = head;
        while(head.next != null){
            ListNode tmpNode = head.next;
            head.next = head.next.next;
            tmpNode.next = newHead;
            newHead = tmpNode;
        }
        return newHead;
    }
}
