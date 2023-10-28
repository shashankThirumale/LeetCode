class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=0){
                list.add(nums[i]);
            }
        }
        int i = 0;
        for(i = 0; i < list.size(); i++){
            nums[i] = list.get(i);
        }
        while(i < nums.length){
            nums[i] = 0;
            i++;
        }
    }
    /**
    Have an ArrayList with numbers from the list that are not zeros
    Then we traverse through the ArrayList and and add them to the nums array starting from the first element
    the rest of the numbers will be zeros
    
    
    TestCases:
    [0,1,0,3,12]
    list = [1,3,12]
    
    */
}