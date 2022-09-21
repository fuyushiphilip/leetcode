class Solution {
public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        
        HashSet<Integer> set = new HashSet<>();
        int maxCount = 0;
        int currCount = 0;
    
        
        // create hashset
        for(Integer num : nums) {
            set.add(num);
        }
        
        // find the most left element
        for(Integer num : set) {
            // if true that means we find the most left element
            if(set.contains(num-1)) {
                continue;
            } else {
                // make sure at least one consecutive output if there is only one element 
                currCount = 1;
                // keep track of next consecutive number 
                while(set.contains(num+1)) {
                    currCount++;
                    num++;
                }
                if(currCount > maxCount) {
                    maxCount = currCount;
                }
            }
        }
        return maxCount;
    }
}
