class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    {
        map.put(0, 0);
        map.put(1, 1);
        map.put(2, 1);
    }
    public int tribonacci(int n) {
        if(map.containsKey(n)){
            return map.get(n);
        }else{
            map.put(n, tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3));
            return map.get(n);
        }
    }
}