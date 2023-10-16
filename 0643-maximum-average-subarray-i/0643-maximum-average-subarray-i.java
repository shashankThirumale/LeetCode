class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start = 0;
        int end = 0+k-1;
        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i < k; i++){
            maxSum += nums[i];
        }
        sum = maxSum;
        while(end+1 < nums.length){
            sum -=nums[start];
            start++;
            end++;
            sum += nums[end];
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return ((double)maxSum)/k;
    }
}