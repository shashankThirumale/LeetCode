class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int high = matrix.length*matrix[0].length-1;
        int low = 0;
        while(low<=high){
            int mid = (high-low)/2 + low;
            int col = mid%matrix[0].length;
            int row = mid/matrix[0].length;
            if(matrix[row][col] == target){
                return true;
            }
            if(matrix[row][col] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }
}