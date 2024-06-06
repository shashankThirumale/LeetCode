class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int total = 0;
        char ss[] = s.toCharArray();
        int i = 0;
        for(;i < ss.length-1; i++){
            if(map.get(ss[i]) < map.get(ss[i+1])){
                total-=map.get(ss[i]);
            }else{
                total+=map.get(ss[i]);
            }
        }
        total+=map.get(ss[i]);
        return total;
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