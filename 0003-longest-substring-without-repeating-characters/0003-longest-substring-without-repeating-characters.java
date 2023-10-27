class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1){
            return 1;
        }
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        char[] ss = s.toCharArray();
        int start = 0;
        for(int i = 0; i < ss.length; i++){
            if(map.containsKey(ss[i])){
                if(i-start > max){
                    max = i-start;
                }
                i = map.get(ss[i]);
                start = i+1;
                map.clear();
            }else{
                map.put(ss[i], i);
            }
        }
        if(s.length()-start > max){
            return s.length()-start;
        }
        return max;
    }
}