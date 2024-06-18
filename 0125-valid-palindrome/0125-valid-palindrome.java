class Solution {
    
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        s = s.toLowerCase();
        int l = 0;
        int r = s.length()-1;
        
        while(l<r){
            while(!Character.isLetterOrDigit(s.charAt(r)) && r>l)
                r--;
            while(!Character.isLetterOrDigit(s.charAt(l)) && l<r)
                l++;
            if(s.charAt(l) != s.charAt(r))
                return false;
            r--;
            l++;
        }
        return true;
    }
}