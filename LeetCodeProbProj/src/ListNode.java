import java.util.ArrayList;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    ListNode(ArrayList<Integer> nodeVals){
        this.val = nodeVals.get(0);
        ListNode currNode = this;
        for(int i=1; i<nodeVals.size(); i++){
            currNode.next = new ListNode(nodeVals.get(i));
            currNode = currNode.next;
        }
        currNode.next = null;
    }
    public void printListNode(){
        ListNode currNode = this;
        while(currNode != null){
            System.out.print(currNode.val + " ");
            currNode = currNode.next;
        }
        System.out.println(" ");
    }
}
