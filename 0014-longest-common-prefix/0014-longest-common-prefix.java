class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String small = strs[0];
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