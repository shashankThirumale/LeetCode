class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                    int currSum = nums[i] + nums[j] + nums[k];
                    if(Math.abs(currSum-target)< Math.abs(target-closest)){
                        closest = currSum;
                    }
                }
            }
        }
        return closest;
    }
}