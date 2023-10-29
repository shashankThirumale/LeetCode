class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = n;
        while(true){
            int currSum = 0;
            while(sum != 0){
                currSum += Math.pow(sum%10, 2);
                sum = sum/10;
            }
            if(set.contains(currSum)){
                return false;
            }else{
                set.add(currSum);
            }
            if(currSum == 1){
                return true;
            }
            sum = currSum;
        }
    }
        
        
}