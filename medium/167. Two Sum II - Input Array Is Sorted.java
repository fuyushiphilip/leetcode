class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // two pointers
        int left = 0; // first index
        int right = numbers.length - 1; // last index
        
        while(left < right) {
            if(numbers[left] + numbers[right] == target) {
                break;
            }
            if(numbers[left] + numbers[right] > target) {
                right--;
                continue;
            } 
            left++;
        }
        return new int[]{left+1,right+1};
    }
}
