class RandomizedCollection {
    private HashMap<Integer, Set<Integer>> map;
    private List<Integer> list;
    
    public RandomizedCollection() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            list.add(val);
            Set<Integer> temp = map.get(val);
            temp.add(list.size()-1);
            return false;
        }else{
            Set<Integer> set = new HashSet<>();
            set.add(list.size());
            map.put(val, set);
            list.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)){
            int index = 0;
            Set<Integer> temp = map.get(val);
            for(Integer i: temp){
                index = i;
                break;
            }
            temp.remove(index);
            int value = list.get(list.size()-1);
            int oldInd = list.size()-1;
            list.set(index, value);
            list.remove(list.size()-1);
            Set<Integer> n = map.get(value);
            n.add(index);
            n.remove(oldInd);
            if(temp.size() == 0){
                map.remove(val);
            }
            return true;
        }else{
            return false;
        }
    }
    
    public int getRandom() {
        int rand = (int)(Math.random() * list.size());
        return list.get(rand);
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */