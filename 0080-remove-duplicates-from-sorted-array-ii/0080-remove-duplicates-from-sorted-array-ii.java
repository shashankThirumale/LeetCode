class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashMap<Integer, Integer> set = new LinkedHashMap<>();
        for(int i = 0; i < nums.length; i++){
            set.put(nums[i], set.getOrDefault(nums[i], 0)+1);
        }
        int i = 0;
        int size = 0;
        for(int num: set.keySet()){
            int reps = set.get(num);
            size++;
            nums[i++] = num;
            if(reps >= 2){
                nums[i++] = num;
                size++;
            }
        }
        return size;
    }
    
    
}