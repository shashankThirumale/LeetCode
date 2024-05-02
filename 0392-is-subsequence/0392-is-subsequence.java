class Solution {
    public boolean isSubsequence(String s, String t) {
        char ss[]=s.toCharArray(), tt[]=t.toCharArray();
        int i = 0;
        for(int j = 0; j < tt.length; j++){
            if(i >= ss.length){
                return true;
            }
            char c = ss[i];
            if(tt[j] == c){
                i++;
            }
        }
        if(i >= ss.length)
            return true;
        return false;
    }
}