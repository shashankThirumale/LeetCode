class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0; 
        for (int num:nums){
            if(num != 0){
                nums[i] = num;
                i++;
            }
        }
        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
    }
    /**
    We go though the list
    We insert the numbers that are not zeros to the front of the array
    We keep track of where to insert them with a variable
    For the rest of the spaces in teh array we fill them up with a 0;
    
    Test Cases:
    nums = [1,3,12,0,10]
    index = 4
    i = 4
    */
}