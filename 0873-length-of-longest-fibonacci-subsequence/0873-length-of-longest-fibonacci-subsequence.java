class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int max = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        
        int prev = 0;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                int currLen = 0;
                int search = arr[i]+arr[j];//3
                prev = arr[j];//2
                while(set.contains(search)){
                    currLen++;
                    int temp = search;
                    search+=prev;
                    prev = temp;
                }
                if(currLen!=0)
                    max = Math.max(currLen+2, max);
            }
        }
        return max;
    }
}