class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int ret = 0;
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            if(nums[left] + nums[right] == k){
                ret++;
                left++;
                right--;
            }else if(nums[left] + nums[right] > k){
                right--;
            }else if(nums[left] + nums[right] < k){
                left++;
            }
        }
        return ret;
    }
}