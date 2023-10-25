class Solution {
    public String removeStars(String s) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '*'){
                str.append(s.charAt(i));
            }else{
                str.deleteCharAt(str.length()-1);
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