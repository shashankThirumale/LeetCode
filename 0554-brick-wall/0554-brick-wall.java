class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int greatest = 0;
        for(int i = 0; i < wall.size(); i++){
            List<Integer> curr = wall.get(i);
            int count = 0;
            
            for(int j = 0; j < curr.size()-1; j++){
                int check = 0;
                count += curr.get(j);
                map.put(count, check = map.getOrDefault(count, 0)+1);
                greatest = Math.max(greatest, check);
            }
            
        }
        
        return wall.size() - greatest;
        
        
    }
    
    /*
    - We go through reach row and determine where all of the edges are. 
    Map to keep tracks of repitions of all of the gaps
    for(rows)
        keep track of how far we are from teh start
        go through the specific row
            update the map for that specific gap (use variable above to keep track how far the gap is)
            
    return the most common gap
        
    
    */
}