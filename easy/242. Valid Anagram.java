class Solution {
    public boolean isAnagram(String s, String t) {
        // create hasdMap
        HashMap<Character, Integer> map = new HashMap<>();
        // convert string to charArray
        char[] charArr = s.toCharArray();
        char[] charArrT = t.toCharArray();
        // map character to count freq
        for(int i = 0; i < s.length(); i++) {
            char key = charArr[i];
            if(map.containsKey(key)) {
                map.put(key, map.get(key)+1);
            } else {
                map.put(key, 1);
            }
        }
        // loop the t, 
        for(int i = 0; i < t.length(); i++) {
            char key = charArrT[i];
            if(map.containsKey(key)) {
                map.put(key, map.get(key)-1);
            } else {
                return false;
            }
        }
        // loop the values if != 0 return false, else true
        for(Integer i : map.values()) {
            if(i != 0) {
                return false;
            }
        } 
        return true;
    }
}
