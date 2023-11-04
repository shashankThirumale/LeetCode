class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 1;
        int nonZeroSum = 1;
        int numZeros = 0;
        for(int n: nums){
            if(n != 0){
                nonZeroSum*=n;
            }else{
                numZeros++;
            }
            sum *=n;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                if(numZeros <= 1)
                    result[i] = nonZeroSum;
                else
                    result[i] = 0;
            }else{
                result[i] = sum/nums[i];
            }
            
        }
        return result;
    }
}