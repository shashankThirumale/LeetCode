class Solution {
    public static int[] mergeArray(int[] n1, int[] n2){
        int[] result = new int[n1.length + n2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<n1.length && j<n2.length){
            if(n1[i]<n2[j]){
                result[k] = n1[i];
                i++;
                k++;
            }
            else{
                result[k] = n2[j];
                j++;
                k++;
            }
        }
        if(i<n1.length){
            while(i<n1.length){
                result[k] = n1[i];
                i++;
                k++;
            }
        }
        else{
            while(j<n2.length){
                result[k] = n2[j];
                j++;
                k++;
            }
        }
        return result;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int sortArr[] = mergeArray(nums1, nums2);
        if(length%2 != 1){
            double result = ((double)sortArr[length/2-1] + sortArr[length/2])/2;
            return result;
        }
        else
            return (double)sortArr[length/2];
    }
}