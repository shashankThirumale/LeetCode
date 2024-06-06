class Solution {
    public int integerReplacement(long n) {
        HashMap<Long, Integer> map = new HashMap<>();
        map.put((long)1, 0);
        return helper(n, map);
    }
    private int helper(long n, HashMap<Long, Integer> map){
        if(map.containsKey(n)){
            return map.get(n);
        }
        if(n%2 == 0){
            int count = 1 + helper(n/2, map);
            map.put(n, count);
            return count;
        }else{
            int count = 1+Math.min(helper(n-1, map), helper(n+1, map));
            map.put(n, count);
            return count;
        }
    }
    
}