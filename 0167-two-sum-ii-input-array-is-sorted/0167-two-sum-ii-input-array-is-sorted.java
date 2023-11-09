class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++){
            int[] result = new int[2];
            result[0] = i;
            int left = i+1;
            int right = numbers.length-1;
            while(left <= right){
                int mid = (right-left)/2 +left;
                if(numbers[mid] > target-numbers[result[0]]){
                    right = mid-1;
                }else if(numbers[mid] < target-numbers[result[0]]){
                    left = mid+1;
                }else{
                    result[1] = mid;
                    result[0] = result[0]+1;
                    result[1] = result[1]+1;
                    return result;
                }
            }
        }
        return new int[2];
    }
}