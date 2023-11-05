class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];

        for(char x: s.toCharArray()){
            count[x-'a']++;
        }
        for(char x: t.toCharArray()){
            count[x-'a']--;
        }
        for(int i: count){
            if(i!=0){
                return false;
            }
        }
        return true;

    }
}