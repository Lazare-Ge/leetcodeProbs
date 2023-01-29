public class SortList {
    public static ListNode mergeLinkedLists(ListNode head1, ListNode head2){
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        ListNode nodePtr1 = head1;
        ListNode nodePtr2 = head2;
        ListNode resHead = null;
        if(nodePtr1.val > nodePtr2.val){
            resHead = nodePtr2;
            nodePtr2 = nodePtr2.next;
        }else{
            resHead = nodePtr1;
            nodePtr1 = nodePtr1.next;
        }
        ListNode resPtr = resHead;
        while(nodePtr1 != null && nodePtr2 != null){
            if(nodePtr1.val > nodePtr2.val){
                resPtr.next = nodePtr2;
                nodePtr2 = nodePtr2.next;
            }else{
                resPtr.next = nodePtr1;
                nodePtr1 = nodePtr1.next;
            }
            resPtr = resPtr.next;
        }
        resPtr.next = (nodePtr1 == null) ? nodePtr2 : nodePtr1;
        return resHead;
    }

    public static ListNode sortList(ListNode head){
        // Split in two
        if(head == null) return null;
        if(head.next == null) { head.printListNode(); return head; }
        ListNode left = head;
        ListNode right = left;
        while(true){
            right = right.next.next;
            if(right == null || right.next == null){
                ListNode tmpNode = left.next;
                left.next = null;
                left = tmpNode;
                break;
            }else{
                left = left.next;
            }
        }
        right = left;
        left = head;
        // Sort both lists
        left = sortList(left);
        right = sortList(right);
        // return merged
        return mergeLinkedLists(left, right);
    }
}
