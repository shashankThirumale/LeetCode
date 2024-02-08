class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        int currNum = nums[0];
        int tracker = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == currNum){
                if(tracker < 2){
                    nums[index] = currNum;
                    index++;
                }
                tracker++;
            }else{
                currNum = nums[i];
                nums[index++] = currNum;
                tracker = 1;
            }
        }
        return index;
    }
    
    
}