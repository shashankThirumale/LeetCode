class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum+=nums[i];
        }
        int currSum = 0;
        for(int i = 0; i < nums.length; i++){
            if(currSum*2 == sum-nums[i]){
                return i;
            }
            currSum+=nums[i];
        }
        return -1;
    }
}
