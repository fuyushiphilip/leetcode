class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length < 2) return new int[] {};
        HashMap<Integer, Integer> map = new HashMap<>();
        // HashMap: element - > i (index))
        for(int i = 0; i < nums.length; i++) {
            int targetKey = target - nums[i];
            int key = nums[i];
            if(map.containsKey(targetKey)){
                return new int[] {map.get(targetKey), i};
            } else {
                map.put(key, i);
            }
        }
        return new int[] {};
    }
}
