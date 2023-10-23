class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            set1.add(nums1[i]);
        }
        
        List<List<Integer>> result = new ArrayList<>();
        result.add(null);
        result.add(null);
        HashSet<Integer> set2 = new HashSet<>();
        ArrayList<Integer> sec = new ArrayList<>();
        for(int i = 0; i < nums2.length; i++){
            if(!set2.contains(nums2[i])){
                set2.add(nums2[i]);
                if(!set1.contains(nums2[i])){
                    sec.add(nums2[i]);
                }
            }
        }
        result.set(1, sec);
        
        ArrayList<Integer> fir = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            if(!set2.contains(nums1[i]) && set1.contains(nums1[i])){
                fir.add(nums1[i]);
                set1.remove(nums1[i]);
            }
        }
        result.set(0, fir);
        return result;
    }
}