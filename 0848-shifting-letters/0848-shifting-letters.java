class Solution {
    public String shiftingLetters(String s, int[] shif) {
        long total = 0;
        long[] shifts = new long[shif.length];
        for(int i = shifts.length-1; i > -1; i--){
            long temp = shif[i]+total;
            shifts[i] = shif[i]+total;
            total = temp;
        }

        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++){
            long shift = shifts[i]%26;
            if(shift > 'z' - arr[i]){
                shift -= 'z' - arr[i] +1;
                arr[i] = 'a';
            }
            
            arr[i] = (char)((int)arr[i]+shift);
        }
        return String.valueOf(arr);
    }
}

/*
int total = 0;
for(int i = 0; i < shifts.length; i++){
    shifts[i] = shifts[i]+total;
    total+= (shift[i]-total);
}

char[] arr = s.toString();

for(int i = 0; i < arr; i++){
    arr[i] = arr[i]+shifts[i];
}
return String.valueOf(arr);
*/