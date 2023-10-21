class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        int tracker = 0;
        int currNum = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != currNum){
                currNum = nums[i];
                tracker = 1;
                nums[index] = nums[i];
                index++;
            }else{
                tracker++;
                if(tracker < 3){
                    nums[index] = nums[i];
                    index++;
                }
            }
        }
        return index;
    }
    
    /*
     Questions:
     - Can there be negative numbers? - Yes
     - Can the array be empty? - no has to be atleast 1
     
     Possible solutions:
     - A LinkedHashMap
     - key would be the actual number. value would be the frequency.
     - Then we can traverse through the LinkedHashMap in the order that we insert and change values 
        in the array
        
    */
}