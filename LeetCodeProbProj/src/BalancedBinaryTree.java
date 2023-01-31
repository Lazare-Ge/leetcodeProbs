import java.util.LinkedList;
import java.util.List;

public class BalancedBinaryTree {
    public static int getTreeDepth(TreeNode root){
        // Base case
        if(root == null) return 0;

        int leftDepth = getTreeDepth(root.left);
        if(leftDepth == -1) return -1;

        int rightDepth = getTreeDepth(root.right);
        if(rightDepth == -1) return -1;

        System.out.println(leftDepth + "  " + rightDepth);
        if(Math.abs(leftDepth - rightDepth) > 1) return -1;

        return Integer.max(leftDepth, rightDepth) + 1;
    }
    public static boolean isBalanced(TreeNode root){
        return getTreeDepth(root) != -1;
    }
}
