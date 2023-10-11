class Solution {
    public void merge(int[] nums, int m, int[] two, int n) {
        int one[] = new int[m];
        for(int i = 0; i < m; i++){
            one[i] = nums[i];
        }
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<m && j < n){
            if(one[i] < two[j]){
                nums[k] = one[i];
                i++;
                k++;
            }else{
                nums[k] = two[j];
                j++;
                k++;
            }

        }
        while(j<n){
            nums[k] = two[j];
            j++;
            k++;
        }
        while(i<m){
            nums[k] = one[i];
            i++;
            k++;
        }
    }
}