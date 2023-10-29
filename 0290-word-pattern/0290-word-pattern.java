class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        int i = 0;
        int j = 0;
        while(i < pattern.length() && j < s.length()){
            char add = pattern.charAt(i++);
            int start = j;
            while(j < s.length() && s.charAt(j) != ' '){
                j++;
            }
            String curr = s.substring(start,j);
            j++;
            if(!map.containsKey(add)){
                if(map.containsValue(curr)){
                    return false;
                }
                map.put(add, curr);
            }else{
                if(!map.get(add).equals(curr)){
                    return false;
                }
            }
        }
        if(j < s.length() || i < pattern.length()){
            return false;
        }
        return true;
    }
}