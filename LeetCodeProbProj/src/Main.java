public class Main {
    public static void main(String[] args) {
        PartitionEqualSubSetSum prob = new PartitionEqualSubSetSum();
        int[] nums = {1,5,11,5};
        int[] nums2 = {1,2,3,4,5};
        int[] nums3 = {1,2,5};
        //System.out.println(prob.canPartition(nums));
        //System.out.println(prob.canPartition(nums2));
        System.out.println(prob.canPartition(nums));
    }
}