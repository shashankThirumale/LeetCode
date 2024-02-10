class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        for (int i = 0; i < gas.length; i++){
            tank = tank + gas[i] - cost[i];
        }
        if(tank < 0){
            return -1;
        }
        
        int index = 0;
        int store = 0;

        for(int i = 0; i < gas.length; i++){
            int fill = gas[i] - cost[i];
            if(fill + store < 0){
                index = i + 1;
                store = 0;
            }else{
                store += fill;
            }
        }
        return index;
    }
}