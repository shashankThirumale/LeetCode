class Solution {
    public String longestCommonPrefix(String[] strs) {
        String small = strs[0];
        for(int i = 1; i<strs.length; i++){
            if(strs[i].length()<small.length())
                small = strs[i];
        }
        String lar = "";
        for(int k = 0; k<small.length(); k++){
            boolean all = true;
            String curr = small.substring(0,k+1);
            for(int j = 0; j<strs.length; j++){
                if(strs[j].indexOf(curr) != 0)
                    all = false;
            }
            if(all)
                lar = curr;
        }
        return lar;
    }
}