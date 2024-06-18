class Solution {
    
    public boolean isPalindrome(String s) {
        int l = 0;
      int r = s.length()-1;
      s = s.toLowerCase();

      while(l < r){
        boolean bothAlpha = true;

        if(Character.isLetterOrDigit(s.charAt(l)) == false){
          l++;
          bothAlpha = false;
        }
        if(Character.isLetterOrDigit(s.charAt(r)) == false){
          r--;
          bothAlpha = false;
        }

        if(bothAlpha){
          if(s.charAt(l) != s.charAt(r)){
            return false;
          }
          r--;
          l++;
        }
      }
      return true;
    }
}