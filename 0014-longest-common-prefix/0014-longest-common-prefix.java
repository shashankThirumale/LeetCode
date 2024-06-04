class Solution {
    public String longestCommonPrefix(String[] strs) {
        String small = strs[0];
        for(int i = 1; i<strs.length; i++){
            if(strs[i].length()<small.length())
                small = strs[i];
        }
        StringBuilder lar = new StringBuilder();
        for(int k = 0; k<small.length(); k++){
            boolean all = true;
            char curr = small.charAt(k);
            for(int j = 0; j<strs.length; j++){
                if(strs[j].charAt(k) != curr)
                    all = false;
            }
            if(all)
                lar.append(curr);
            else
                break;
        }
        return lar.toString();
    }
}