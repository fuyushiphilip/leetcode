class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        int left = 0;
        int right = s.length()-1;
        char[] cArr = s.toCharArray();

        while(left < right) {

            while(left<right && vowels.indexOf(cArr[left]) == -1) {
                left++;
            }
            while(left<right && vowels.indexOf(cArr[right]) == -1) {
                right--;
            }
            swap(left, right, cArr);
            left++;
            right--;
        }
        return new String(cArr);
    }
    public void swap(int i, int j, char[] cArr) {
        char temp = cArr[i];
        cArr[i] = cArr[j];
        cArr[j] = temp;
    }

}
