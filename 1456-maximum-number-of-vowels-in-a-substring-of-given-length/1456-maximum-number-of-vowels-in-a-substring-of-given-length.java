class Solution {
    public int maxVowels(String s, int k) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] chars = s.toCharArray();
        int max = 0;
        int curr = 0;
        for(int i = 0; i < k; i++){
            for(int j = 0; j < vowels.length; j++){
                if(vowels[j] == chars[i]){
                    max++;
                }
            }
        }
        int start = 0;
        int end = k-1; 
        curr = max;
        while(end+1 < chars.length){
            for(int j = 0; j < vowels.length; j++){
                if(vowels[j] == chars[start]){
                curr--;
                }
            }
            start++;
            end++;
            for(int j = 0; j < vowels.length; j++){
                if(vowels[j] == chars[end]){
                    curr++;
                    if(curr > max)
                        max = curr;
                }
            }
        }
        return max;
    }
}