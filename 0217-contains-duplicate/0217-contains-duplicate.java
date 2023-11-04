class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int n: nums){
            if(set.contains(n)){
            }else{
                set.add(n);
            }
        }
        if(set.size() == nums.length){
            return false;
        }
        return true;
    }
}