class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('i');
        set.add('e');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('I');
        set.add('O');
        set.add('E');
        set.add('U');
        int right = s.length()-1;
        int left = 0;
        char[] arr = s.toCharArray();
        while(left < right){
            while(left < s.length() && set.contains(arr[left]) == false){
                left++;
            }
            while(right > -1 && set.contains(arr[right]) == false){
                right--;
            }
            if(left < s.length() && right > -1 && left < right){
                char temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;
            }
        }
        return String.valueOf(arr);
    }
}