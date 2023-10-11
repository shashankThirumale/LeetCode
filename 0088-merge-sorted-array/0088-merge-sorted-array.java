class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastSort = m-1;
        int j = 0;
        while(j<n && j>-1){
            int k = 0;
            while(nums2[j]>nums1[k] && k>-1 && k<lastSort+1){
            	k++;
            }
            for(int i = lastSort; i>=k && i<m+n-1; i--){
                nums1[i+1] = nums1[i];
                nums1[i] = 0;
            }
            lastSort++;
            nums1[k] = nums2[j];
            j++;
        }

    }
}