import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PartitionEqualSubSetSum {
    public static boolean partitionRec(ArrayList<Integer> first, ArrayList<Integer> second,
                                       int firstSum, int secondSum){
        if(second.isEmpty()) return false;
        if(firstSum == secondSum) { return true; }
        for(int i=0; i<second.size(); i++){
            int removed = second.remove(i);
            first.add(removed);
            if(partitionRec(first, second, firstSum + removed, secondSum - removed)) return true;
            first.remove(first.size()-1);
            second.add(i, removed);
        }
        return false;
    }
    public static boolean canPartition(int[] nums){
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        int secondSum = 0;
        for(int i=0; i<nums.length; i++){ second.add(nums[i]); secondSum += nums[i]; }
        return partitionRec(first, second, 0 , secondSum);
    }
}
