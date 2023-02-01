import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BSTIterator {
    List<TreeNode> nodes;
    int currIndex;
    public static List<TreeNode> getNodesInOrder(TreeNode root){
        if(root == null) return null;
        List<TreeNode> leftNodes = getNodesInOrder(root.left);
        List<TreeNode> rightNodes = getNodesInOrder(root.right);
        List<TreeNode> res = leftNodes != null ? new ArrayList<>(leftNodes) : new ArrayList<>();
        res.add(root);
        if(rightNodes != null) res.addAll(rightNodes);
        return res;
    }
    public BSTIterator(TreeNode root){
        this.nodes = getNodesInOrder(root);
        this.currIndex = 0;
    }
    public int next(){
        return this.nodes.get(this.currIndex++).val;
    }

    public boolean hasNext(){
        return currIndex < this.nodes.size();
    }
}
