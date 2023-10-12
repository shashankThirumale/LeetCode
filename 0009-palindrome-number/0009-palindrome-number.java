class Solution {
    public boolean isPalindrome(int x) {
        int a = x;
        int r = 0, d;
        while(x>0){
            d = x%10;
            r = r*10+d;
            x = x/10;
        }
        if(r==a)
            return true;
        return false;
    }
}