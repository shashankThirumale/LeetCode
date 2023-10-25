class Solution {
    public String removeStars(String s) {
        char[] chars = s.toCharArray();
        ArrayList<Character> stack = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < chars.length; i++){
            if(chars[i] != '*'){
                stack.add(chars[i]);
            }else{
                if(stack.size() != 0){
                    stack.remove(stack.size()-1);
                }
            }
        }
        for(Character c: stack){
            str.append(c);
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