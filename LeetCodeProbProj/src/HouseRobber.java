import java.util.Arrays;

public class HouseRobber {
    int maxCash = Integer.MIN_VALUE;
    //Starting i  =  num.length - 1
    int[] numsMem;
    public int maxCash(int[] nums, int i){
        if(i < 0) return 0;
        if(numsMem[i] != -1){
            return numsMem[i];
        }
        int answ = Integer.max(maxCash(nums, i-2) + nums[i], maxCash(nums, i-1));
        numsMem[i] = answ;
        return answ;
    }
    public int rob(int[] nums){
        numsMem = new int[nums.length];
        Arrays.fill(numsMem, -1);
        return maxCash(nums, nums.length-1);
    }
}
