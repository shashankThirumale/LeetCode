class Solution {
    public String countAndSay(int n) {
        String num = "1";
        for(int i = 0; i < n-1; i++){
            StringBuilder sb = new StringBuilder();
            int reps = 0;
            char curr = num.charAt(0);
            for(int j = 0; j < num.length(); j++){
                if(curr == num.charAt(j)){
                    reps++;
                }else{
                    sb.append(reps);
                    sb.append(curr);
                    curr = num.charAt(j);
                    reps = 1;
                }
            }
            sb.append(reps);
            sb.append(curr);
            num = sb.toString();
        }
        return num;
    }
}