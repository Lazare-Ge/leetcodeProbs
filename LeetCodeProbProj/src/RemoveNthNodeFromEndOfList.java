import java.util.ArrayList;

public class RemoveNthNodeFromEndOfList {
    static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }
    public static ListNode removeNthFromEnd(ListNode head, int n){
        ArrayList<ListNode> nodeArr = new ArrayList<>();
        ListNode currNode = head;
        while(currNode != null){
            nodeArr.add(currNode);
            currNode = currNode.next;
        }
        if(nodeArr.size() == 1) return null;
        if(n == nodeArr.size()) return head.next;
        if(n == 1){
            ListNode prevNode = nodeArr.get(nodeArr.size() - n - 1) ;
            prevNode.next = null;
        }else{
            ListNode prevNode = nodeArr.get(nodeArr.size() - n - 1);
            prevNode.next = prevNode.next.next;
        }
        return head;
    }
}
