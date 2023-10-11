class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int possible = 0;
        for(int num: nums){
            if(count == 0)
                possible = num;
            if(num == possible)
                count++;
            else
                count--;
        }
        return possible;
    }
}