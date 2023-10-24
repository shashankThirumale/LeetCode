class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] result = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            while(left < right && vowels.indexOf(result[left]) == -1){
                left++;
            }

            while(left < right && vowels.indexOf(result[right]) == -1){
                right--;
            }

            char temp = result[right];
            result[right] = result[left];
            result[left] = temp;
            left++;
            right--;
        }
        return new String(result);
    }
}