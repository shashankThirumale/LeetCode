class RecentCounter {
    Queue<Integer> queue;
    int size = 0;
    
    public RecentCounter() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.add(t);
        size++;
        int start = -3000+t;
        while(queue.peek() != null && queue.peek() < start){
            queue.remove();
            size--;
        }
        return size;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */