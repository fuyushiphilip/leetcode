class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        int left = 1;
        int right = 1;

        while(right < nums.length) {
            if(nums[right] == nums[right-1]) {
                right++;
            } else {
                nums[left] = nums[right];
                left++;
                right++;
            }
        }
    return left;
    }
}
