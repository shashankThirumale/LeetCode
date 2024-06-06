class Solution {
    public String intToRoman(int num) {
        String map[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int array[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < array.length; i++){
            int total = num/array[i];
            for(int j = 0; j < total; j++)
                sb.append(map[i]);
            num = num%array[i];
        }
        return sb.toString();
    }
    /*
    We need to covert the String to the corresponding Roman number
    Plan
        have an HashMap key = num value = Symbol
        have an array with all of the possible values start with largest values
    
    psuedo
    map
    array
    StringBuilder sb
    for(int i = 0; i < array.length; i++){
        total = num/array[i];
        for(int j = 0; j < total; j++)
            sb.append(map.get(array[i]));
        num = num%1000;
    }
    return sb.toString();
    */
}