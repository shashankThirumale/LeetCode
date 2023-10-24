class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while(right>left){
            int area = right-left;
            if(height[left]<height[right]){
                area *= height[left];
                left++;
            }
            else{
                area *= height[right];
                right--;
            }
            if(area>max)
                max = area;
        }
        return max;
    }
}