public class DiameterOfBinaryTree {
    static int maxDiameter = Integer.MIN_VALUE;
    public static int getTreeDepth(TreeNode root){
        if(root == null) return 0;
        int leftDepth = getTreeDepth(root.left);
        int rightDepth = getTreeDepth(root.right);
        if(leftDepth + rightDepth > maxDiameter) maxDiameter = leftDepth + rightDepth;
        return Integer.max(leftDepth, rightDepth) + 1;
    }
    public static int diameterOfBinaryTree(TreeNode root){
        getTreeDepth(root);
        return maxDiameter;
    }
}
