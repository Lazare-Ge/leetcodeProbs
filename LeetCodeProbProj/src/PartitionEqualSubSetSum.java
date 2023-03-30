import java.util.*;
import java.util.stream.Collectors;

public class PartitionEqualSubSetSum {
    private int[] nums;
    private int[][] dp;
    private int target;

    public boolean canPartition(int[] nums){
        this.nums = nums;
        int numSum = 0;
        for(int num : nums){ numSum+=num; }
        if(numSum % 2 != 0) return false;
        this.dp = new int[nums.length][numSum+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        this.target = numSum / 2;
        return recSol4(0, 0);
    }

    public boolean recSol4(int i, int curSum){
        if(curSum == target) return true;
        if(i >= nums.length || curSum > target) return false;
        if(dp[i][curSum] != -1) return dp[i][curSum] == 1;
        boolean notTake = recSol4(i+1, curSum);
        boolean take = recSol4(i+1, curSum + nums[i]);
        boolean answ = notTake || take;
        dp[i][curSum] = answ ? 1 : 0;
        return answ;
    }
}
