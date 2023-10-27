class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1){
            return 1;
        }
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        char[] ss = s.toCharArray();
        int start = 0;
        for(int i = 0; i < ss.length; i++){
            if(set.contains(ss[i])){
                if(i-start > max){
                    max = i-start;
                }
                i = start;
                start++; 
                set.clear();
            }else{
                set.add(ss[i]);
            }
        }
        if(s.length()-start > max){
            return s.length()-start;
        }
        return max;
    }
}