import java.util.ArrayList;
import java.util.List;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root){
        if(root == null) return null;
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        while(!nodes.isEmpty()){
            TreeNode removed = nodes.remove(nodes.size()-1);
            TreeNode tmp = removed.left;
            removed.left = removed.right;
            removed.right = tmp;
            if(removed.left != null) nodes.add(removed.left);
            if(removed.right != null) nodes.add(removed.right);
        }
        return root;
    }
}
