class Solution {
    public boolean containsDuplicate(int[] nums) {
        // create hashset
        HashSet<Integer> set = new HashSet<>();
        // return true if set contains current number
        // if not then add the current to the set
        for(Integer num : nums) {
            if(set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}
