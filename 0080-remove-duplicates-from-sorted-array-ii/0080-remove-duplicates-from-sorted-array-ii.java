class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        int j = 0;
        int size = 0;
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            if(map.getOrDefault(curr, 0) == 2){
                while(nums[i++] != curr){
                }
                i--;
            }else{
                nums[j++] = curr;
                map.put(curr, map.getOrDefault(curr, 0) + 1);
                size++;
            }
        }
        return size;
    }
    
    
}