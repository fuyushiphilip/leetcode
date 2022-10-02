class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        if(s == null || s.length() == 0) return 0;
        int left = 0;  // the left boundary of window
        int right = 0; // the right boundary of window
        int maxLen = 1; // output

        for(right = 0; right < s.length(); right++) {
            char key = s.charAt(right);
            if(map.containsKey(key)) {
                left = Math.max(left, map.get(key)+1); // update left boundary of window
            }
            maxLen = Math.max(maxLen, right - left + 1); // update the longest length of window 
            map.put(key, right);
        }
        return maxLen;
    }
}
