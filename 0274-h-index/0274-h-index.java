class Solution {
    public int hIndex(int[] citations) {
        int h[] = new int[citations.length+1];
        for(int i: citations){
            if(i > citations.length){
                h[citations.length] = h[citations.length]+1;
            }else{
                h[i] = h[i] +1;
            }
        }
        int count = 0;
        for(int i = citations.length; i >= 0; i--){
            count+=h[i];
            if(count >= i){
                return i;
            }
        }
        return 0;
    }
}