class Solution {
    public int compress(char[] chars) {
        int index = 0;
        for(int i = 0; i< chars.length; i++){
            int freq = 1;
            char curr = chars[i];
            int j = i+1;
            while(j< chars.length && chars[j] == curr){
                freq++;
                j++;
            }
            chars[index++] = curr;
            if(freq != 1){
                String add = ""+freq;
                for(int k = 0; k < add.length(); k++){
                    chars[index++] = add.charAt(k);
                }
            }
            i = j-1;
        }
        return index;
    }
    /**
   
    */
        
}