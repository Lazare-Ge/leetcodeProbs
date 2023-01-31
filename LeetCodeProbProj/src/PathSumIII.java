import java.util.ArrayList;

public class PathSumIII {
    int targetCount = 0;
    public ArrayList<Long> generateSums(TreeNode root, int targetSum){
        if(root == null) return new ArrayList<>();
        ArrayList<Long> leftSums = generateSums(root.left, targetSum);
        ArrayList<Long> rightSums = generateSums(root.right, targetSum);
        ArrayList<Long> res = new ArrayList<>();
        if(root.val == targetSum) targetCount++;
        res.add((long)root.val);
        for(long sum : leftSums){
            if(sum + root.val == targetSum) targetCount++;
            res.add(sum + root.val);
        }
        for(long sum : rightSums) {
            if (sum + root.val == targetSum) targetCount++;
            res.add(sum + root.val);
        }
        return res;
    }
    public int pathSum(TreeNode root, int targetSum){
        generateSums(root, targetSum);
        return targetCount;
    }
}
