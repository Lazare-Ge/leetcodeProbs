public class ConvertSortedArrayToBinarySearchTree {
    public static TreeNode toBSTHelp(int[] nums, int l, int r, TreeNode root){
        if(l > r) return null;
        int m = l + (r-l)/2;
        root = new TreeNode(nums[m]);
        root.right = toBSTHelp(nums, m+1, r, root.right);
        root.left = toBSTHelp(nums, l, m-1, root.left);
        return root;
    }
    public static TreeNode sortedArrayToBST(int[] nums){
        return toBSTHelp(nums, 0, nums.length-1, null);
    }
}
