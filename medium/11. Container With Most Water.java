class Solution {
    public int maxArea(int[] height) {
        // two pointers
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        int currArea = 0;
        int heightVal = 0;
        int widthVal = 0;
        
        // find max area = the longest distance of two indices
        // and the larger element
        while(left < right) {
            
            if(height[left] <= height[right]) {
                heightVal = height[left];
            } else {
                heightVal = height[right];
            }
            
            widthVal = right - left;
            currArea = heightVal * widthVal;
                
            if(currArea > maxArea) {
                maxArea = currArea;
            }   
            
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
