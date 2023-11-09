class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int n = nums.length;
        int sum = 0;

        while(j < n)
        {
            sum += nums[j];

            while(sum >= target)
            {
                // Minimize the window
                len = Math.min(len,j - i + 1);
                sum -= nums[i];
                i++;
            }
            j++;
        }

        if(len == Integer.MAX_VALUE) return 0;

        return len;
    }
}