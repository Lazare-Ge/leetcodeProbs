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
    //[4,2,7,1,3,6,9]
    public void printTreeNode(){
        System.out.println(this.val);
        this.left.printTreeNode();
        this.right.printTreeNode();
    }
}
