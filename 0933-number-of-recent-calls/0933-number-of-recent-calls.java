class RecentCounter {
    ArrayList<Integer> queue;
    int size = 0;
    int index = 0;
    
    public RecentCounter() {
        queue = new ArrayList<>();
    }
    
    public int ping(int t) {
        queue.add(t);
        size++;
        int start = -3000+t;
        while(index<queue.size() && queue.get(index) < start){
            size--;
            index++;
        }
        return size;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */