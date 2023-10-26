class Solution {
    public int longestSubarray(int[] nums) {
        int start = 0;
        boolean found = false;
        int lastZero = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                if(found){
                    int curr = i-1-start;
                    if(curr > max){
                        max = curr;
                    }
                    start = lastZero+1;
                    lastZero = i;
                }else{
                    lastZero = i;
                    found = true;
                }
            }
        }
        int curr = nums.length-1-start;
        if(curr>max){
            max = curr;
        }
        return max;
    }
}