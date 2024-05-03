class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        
        HashSet<Integer> num1 = new HashSet<>();
        HashSet<Integer> num2 = new HashSet<>();
        HashSet<Integer> done = new HashSet<>();
        
        for(int num: nums1){
            num1.add(num);
        }
        
        for(int num: nums2){
            num2.add(num);
        }
        
        for(int num: nums1){
            if(!num2.contains(num) && !done.contains(num)){
                list1.add(num);
                done.add(num);
            }
        }
        done = new HashSet<>();
        for(int num: nums2){
            if(!num1.contains(num) && !done.contains(num)){
                list2.add(num);
                done.add(num);
            }
        }
        ArrayList<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);
        
        return result;
    }
}