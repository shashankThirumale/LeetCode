class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int right = numbers.length-1;
        int left = 0;
        while(left<right){
            if(numbers[left] + numbers[right] > target){
                right--;
            }else if(numbers[left] + numbers[right] < target){
                left++;
            }else{
                int[] result = {left+1,right+1};
                return result;
            }
        }
        return new int[2];
    }
}