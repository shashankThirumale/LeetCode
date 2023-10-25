class Solution {
    public String removeStars(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> fir = new Stack<>();
        Stack<Character> sec = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < chars.length; i++){
            if(chars[i] != '*'){
                fir.push(chars[i]);
            }else{
                if(!fir.empty()){
                    fir.pop();
                }
            }
        }
        while(!fir.empty()){
            sec.push(fir.pop());
        }
        while(!sec.empty()){
            str.append(sec.pop());
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