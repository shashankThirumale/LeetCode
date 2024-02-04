class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(helper(cost, cost.length-1, map), helper(cost, cost.length-2, map));
    }
    public static int helper(int[] cost, int index, HashMap<Integer, Integer> map){
        if(index == 1 || index == 0){
            return cost[index];
        } else if(index < 0){
            return 0;
        }else{
            if(map.containsKey(index)){
                return map.get(index);
            }else{
                int min = Math.min(helper(cost, index-1, map), helper(cost, index-2, map));
                map.put(index, min+cost[index]);
                return map.get(index);
            }
        }
    }
}