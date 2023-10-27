class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ']'){
                StringBuilder toAdd = new StringBuilder();
                while(!stack.peek().equals("[")){
                    toAdd.insert(0,stack.pop());
                }
                stack.pop();
                StringBuilder num = new StringBuilder();
                while(!stack.isEmpty() && stack.peek().length()==1 && Character.isDigit(stack.peek().charAt(0))){
                    num.insert(0, stack.pop());
                }
                int reps = Integer.parseInt(num.toString());
                StringBuilder add = new StringBuilder();
                while(reps > 0){
                    add.append(toAdd.toString());
                    reps--;
                }
                stack.push(add.toString());
            }else{
                stack.push(""+s.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.insert(0,stack.pop());
        }
        return result.toString();
    }
}