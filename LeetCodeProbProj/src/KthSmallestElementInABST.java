public class KthSmallestElementInABST {
    static int currIndex = 0;
    static int ans = -1;
    public static void smallestRec(TreeNode root, int k){
        if(root == null) return;
        smallestRec(root.left, k);
        currIndex++;
        if(currIndex == k) ans = root.val;
        smallestRec(root.right, k);
    }
    public static int kthSmallest(TreeNode root, int k){
        // Go with DFS and while coming back start counting indexes
        smallestRec(root, k);
        return ans;
    }
}
