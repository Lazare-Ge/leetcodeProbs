public class SearchInRotatedSortedArray {
    public static int binarySearch(int l, int r, int[] nums, int target){
        if(l > r) return -1;
        int m = l + (r-l)/2;
        if(nums[m] == target) return m;
        if(target < nums[m]) return binarySearch(l, m-1, nums, target);
        else return binarySearch(m+1, r, nums, target);
    }
    public static int search(int[] nums, int target){
        // Find pivot index
        int l = 1;
        int r = nums.length - 1;
        int m = 0;
        boolean pivotFound = false;
        while(l <= r){
            m = l + (r-l)/2;
            if(nums[m-1] > nums[m]){
                pivotFound = true;
                break;
            }
            if(nums[0] < nums[m]) l = m+1;
            if(nums[0] > nums[m]) r = m-1;
        }
        if(!pivotFound) m = 0;
        int firstHalf = binarySearch(0, m-1, nums, target);
        if(firstHalf != -1) return firstHalf;
        return binarySearch(m, nums.length-1, nums, target );
    }
}
