class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0) return true;
        // convert uppercase to lowercase
        String lowerCaseS = s.toLowerCase();
        // convert to charArry
        char[] charArr = lowerCaseS.toCharArray();
        // create two pointers
        int left = 0; // first index
        int right = s.length()-1; // last index
        
        while(left < right){
            
            if(!Character.isLetterOrDigit(charArr[left])) {
                left++;
                continue; // make sure we get a letter or digit 
            }
            
            if(!Character.isLetterOrDigit(charArr[right])) {
                right--;
                continue; // make sure we get a letter or digit 
            }
            
            if(charArr[left] != charArr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
