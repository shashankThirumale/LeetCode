class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();
        for(int i = 0; i < groupSizes.length; i++){
            LinkedList<Integer> add = map.getOrDefault(groupSizes[i], new LinkedList<Integer>());
            add.add(i);
            map.put(groupSizes[i], add);
        }
        List<List<Integer>> result = new LinkedList<>();
        for(Integer key: map.keySet()){
            LinkedList<Integer> remove = map.get(key);
            while(!remove.isEmpty()){
                Integer loop = key;
                LinkedList<Integer> add = new LinkedList<>();
                while(loop > 0){
                    add.add(remove.remove());
                    loop--;
                }
                result.add(add);
            }
        }
        return result;
    }
}