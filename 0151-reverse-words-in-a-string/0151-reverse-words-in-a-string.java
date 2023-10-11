class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        char[] arr = s.toCharArray();
        int end = arr.length-1;
        int start = arr.length-1;
        while(start> -1 && arr[start] == ' '){
            start--;
            end--;
        }
        while(start > -1){
            while(start > -1 && arr[start] != ' '){
                start--;
            }
            res.append(s.substring(start+1,end+1));
            res.append(' ');
            while(start > -1 && arr[start] == ' '){
                start--;
            }
            end = start;
        }
        String result = res.toString();
        return result.substring(0,result.length()-1);
    }
}