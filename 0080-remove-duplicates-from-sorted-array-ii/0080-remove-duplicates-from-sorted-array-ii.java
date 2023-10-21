class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) == null){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        int index = 0;
        for(Integer key: map.keySet()){
            int freq = 2;
            if(map.get(key) < 2){
                freq = map.get(key);
            }
            for(int j = freq; j > 0; j--){
                nums[index] = key;
                index++;
            }
        }
        return index;
    }
    
    /*
     Questions:
     - Can there be negative numbers? - Yes
     - Can the array be empty? - no has to be atleast 1
     
     Possible solutions:
     - A LinkedHashMap
     - key would be the actual number. value would be the frequency.
     - Then we can traverse through the LinkedHashMap in the order that we insert and change values 
        in the array
        
    */
}