class Solution {
    public String removeStars(String s) {
        char[] chars = s.toCharArray();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < chars.length; i++){
            if(chars[i] != '*'){
                str.append(chars[i]);
            }else{
                str.deleteCharAt(str.length()-1);
            }
        }
        return str.toString();
    }
}