class Solution {
    public void rotate(int[] nums, int k) {
        if(k>nums.length)
            k = k%nums.length;
        int[] temps = new int[k];
        int m = 0;
        for(int i = nums.length-k; i<nums.length; i++){
            temps[m] = nums[i];
            m++;
        }
        for(int j = nums.length-k-1; j >= 0; j--){
            nums[j+k] = nums[j];
        }
        for(int n = 0; n<k; n++){
            nums[n] = temps[n];
        }
    }
}