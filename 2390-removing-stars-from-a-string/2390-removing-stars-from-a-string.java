class Solution {
    public String removeStars(String s) {
        char[] chars = s.toCharArray();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < chars.length; i++){
            if(chars[i] != '*'){
                str.append(chars[i]);
            }else{
                if(str.length() != 0){
                    str.deleteCharAt(str.length()-1);
                }
            }
        }
        return str.toString();
    }
    
    /**
    * We can create a stack that gets pushed all the characters before a star.
    * Then pop out the rest of the elements and push them onto another stack
    * then pop one at a time into a StringBuilder
    * keep doing all of these steps until the end of the String
    */
}