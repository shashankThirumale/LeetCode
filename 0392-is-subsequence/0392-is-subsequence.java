class Solution {
    public boolean isSubsequence(String s, String t) {

        int i=0,j=0;
        int count = 0;
        while(i < s.length() && j < t.length()){
            while(j < t.length() && s.charAt(i) != t.charAt(j)){
                j++;
            }
            if(j < t.length() && s.charAt(i) == t.charAt(j)){
                count++;
                j++;
            }
            i++;
        }
        return count == s.length();
    }
}