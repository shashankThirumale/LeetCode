class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int greatest = 0;
        for(int i = 0; i < wall.size(); i++){
            List<Integer> curr = wall.get(i);
            int count = 0;
            
            for(int j = 0; j < curr.size()-1; j++){
                count += curr.get(j);
                map.put(count, map.getOrDefault(count, 0)+1);
                greatest = Math.max(greatest, map.get(count));
            }
            
        }
        
        return wall.size() - greatest;
        
        
    }
    
    /*
    - We go through reach row and determine where all of the edges are. 
    - 
    for(rows)
        map.put()
    */
}