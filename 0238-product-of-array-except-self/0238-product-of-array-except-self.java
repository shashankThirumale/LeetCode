class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        int count = 0;
        int product = 1;
        for(int num: nums){
            if(num!=0){
                product*=num;
            }else{
                count++;
            }
        }
        int i = 0;
        if(count == 0){
            for(int num: nums){
                result[i++] = product/num;
            }
        }else if(count == 1){
            i = 0;
            for(int num: nums){
                if(num == 0){
                    result[i] = product;
                }
                i++;
            }
        }
        return result;
    }
}