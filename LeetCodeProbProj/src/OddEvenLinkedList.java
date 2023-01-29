public class OddEvenLinkedList {
    public static ListNode oddEvenList(ListNode head){
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode nodePtr1 = head;
        ListNode nodePtr2 = nodePtr1.next;
        while(nodePtr2 != null && nodePtr2.next != null){
            ListNode tmpNode1 = nodePtr1.next;
            ListNode tmpNode2 = nodePtr2.next.next;
            nodePtr1.next = nodePtr2.next;
            nodePtr1.next.next = tmpNode1;
            nodePtr2.next = tmpNode2;
            nodePtr1 = nodePtr1.next;
            nodePtr2 = nodePtr2.next;
        }
        return head;
    }
}
