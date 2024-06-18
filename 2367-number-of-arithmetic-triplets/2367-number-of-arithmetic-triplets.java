class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums){
            set.add(n);
        }
        
        for(int i = nums.length-1; i >= 0; i--){
            int num = nums[i];
            if(set.contains(num-diff) && set.contains(num-diff-diff)){
                count++;
            }
        }
        return count;
    }
    /*
    Match: HashSet so we can find a number that matches or not.
    
    Plan:
    //Add all of the numbers to the set
    start at the end of the list
    for each of the numbers see if n-diff and n-diff-diff exist then increment count
    */
}