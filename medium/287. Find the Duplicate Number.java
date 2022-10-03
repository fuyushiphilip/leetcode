class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        int res = 0;

        while(right < nums.length) {
            if(nums[left] == nums[right]) {
                res = nums[left];
                break;
            }
            left++;
            right++;   
        }
        return res;
    }
}
