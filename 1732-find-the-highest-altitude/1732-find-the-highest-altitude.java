class Solution {
    public int largestAltitude(int[] gain) {
        int alt[] = new int[gain.length];
        int prev = 0;
        int max = 0;
        
        for(int i = 0; i < gain.length; i++){
            alt[i] = prev+gain[i];
            if(alt[i] > max){
                max = alt[i];
            }
            prev = alt[i];
        }
        
        return max;
    }
}