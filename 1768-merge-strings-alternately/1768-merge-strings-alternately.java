class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        int w1 = word1.length();
        int w2 = word2.length();
        StringBuilder sb = new StringBuilder();
        while(i < w1 || j < w2){
            if(i < w1)
                sb.append(word1.charAt(i++));
            if(j < w2)
                sb.append(word2.charAt(j++));
        }
        return sb.toString();
    }
}