import java.util.*;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    TreeNode(List<Integer> lst){
        List<TreeNode> queue = new LinkedList<>();
        this.val = lst.remove(0);
        queue.add(this);
        while(!queue.isEmpty()){
            TreeNode removed = queue.remove(0);
            if(removed != null) {
                if (!lst.isEmpty()) {
                    Integer removedNum = lst.remove(0);
                    removed.left = removedNum == null ? null : new TreeNode(removedNum);
                }
                if (!lst.isEmpty()) {
                    Integer removedNum = lst.remove(0);
                    removed.right = removedNum == null ? null : new TreeNode(removedNum);
                }
                if(lst.isEmpty()) break;
                queue.add(removed.left);
                queue.add(removed.right);
            }
        }
    }

    @Override
    public String toString() {
        return "" + this.val;
    }

    public void printTreeNodeBFS(){
        List<TreeNode> queue = new LinkedList<>();
        queue.add(this);
        while(!queue.isEmpty()){
            TreeNode removed = queue.remove(0);
            if(removed == null){
                System.out.print("N ");
            }else{
                System.out.print(removed + " ");
                queue.add(removed.left);
                queue.add(removed.right);
            }
        }
        System.out.println();
    }
    public void printTreeNodeDFS(){
        List<TreeNode> queue = new LinkedList<>();
        queue.add(this);
        while(!queue.isEmpty()) {
            TreeNode removed = queue.remove(0);
            if(removed == null){
                System.out.print("N ");
            }else{
                System.out.print(removed + " ");
                queue.add(0, removed.right);
                queue.add(0, removed.left);
            }
        }
        System.out.println();
    }
}
