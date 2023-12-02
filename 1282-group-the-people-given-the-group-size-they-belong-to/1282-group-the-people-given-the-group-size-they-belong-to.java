class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new LinkedList<>();
        HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();
        for(int i = 0; i < groupSizes.length; i++){
            LinkedList<Integer> add = map.getOrDefault(groupSizes[i], new LinkedList<Integer>());
            add.add(i);
            if(add.size() == groupSizes[i]){
                result.add(add);
                map.remove(groupSizes[i]);
            }else{
                map.put(groupSizes[i], add);
            }
        }
        
        return result;
    }
}