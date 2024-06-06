class Solution {
    public int romanToInt(String s) {
        int answer = 0, number = 0, prev = 0;

        for (int j = s.length() - 1; j >= 0; j--) {
            switch (s.charAt(j)) {
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }
            if (number < prev) {
                answer -= number;
            }
            else {
                answer += number;
            }
            prev = number;
        }
        return answer;
    }
    /*
    So the goal is to take a roman integer and turn it in to an integer
    
    Idea
    We will have a hashmap key=Symbol value=Value
    
    psuedo
    HashMap<String, Integer> map
    //load values
    int total
    for(i < s.length()-1){
        if map.get(s.charAt(i)) < map.get(s.charAt(i+1))
            total -= map,get(s.charAt(i))
        else{
            total += map.get(s.charAt(i))
        }
    }
    return total;
    */
}