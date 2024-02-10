class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        int costTot = 0;
        for (int i = 0; i < gas.length; i++){
            tank += gas[i];
            costTot += cost[i];
        }
        if(tank < costTot){
            return -1;
        }else{
        
            int index = 0;
            tank = 0;

            for(int i = 0; i < gas.length; i++){
                int fill = gas[i] - cost[i];
                if(fill + tank < 0){
                    index = i + 1;
                    tank = 0;
                }else{
                    tank += fill;
                }
            }
            return index;
        }
    }
}