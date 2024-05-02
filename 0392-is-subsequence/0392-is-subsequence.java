class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        for(int j = 0; j < t.length(); j++){
            if(i >= s.length()){
                return true;
            }
            char c = s.charAt(i);
            if(t.charAt(j) == c){
                i++;
            }
        }
        if(i >= s.length())
            return true;
        return false;
    }
}