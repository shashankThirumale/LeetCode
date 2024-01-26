class Solution {
    public int removeDuplicates(int[] nums) {
        int ind = 0;
        int tracker = 0;
        int curr = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != curr){
                curr = nums[i];
                tracker = 1;
                nums[ind++] = curr;
            }else{
                tracker++;
                if(tracker < 3){
                    nums[ind++] = curr;
                }
            }
        }
        return ind;
    }
    
    
}