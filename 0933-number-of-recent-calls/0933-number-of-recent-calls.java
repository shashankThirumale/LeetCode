class RecentCounter {
    LinkedList<Integer> queue;
    
    public RecentCounter() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.addLast(t);
        int start = -3000+t;
        while(queue.peekFirst() != null && queue.peekFirst() < start){
            queue.remove();
        }
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */