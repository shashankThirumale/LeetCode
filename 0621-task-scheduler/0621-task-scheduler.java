class Solution {
    public int leastInterval(char[] tasks, int n) {
        // frequencies of the tasks
        int[] frequencies = new int[26];
        for (int t : tasks) {
            frequencies[t - 'A']++;
        }

        Arrays.sort(frequencies);

        // max frequency
        int f_max = frequencies[25];
        int idle_time = (f_max - 1) * n;
        
        for (int i = frequencies.length - 2; i >= 0 && idle_time > 0; --i) {
            idle_time -= Math.min(f_max - 1, frequencies[i]); 
        }
        idle_time = Math.max(0, idle_time);

        return idle_time + tasks.length;
    }
    
    /*
    So we have an array for all 26 letters
    We go through the array
    when we see a letter we increment the freq
    sort the array is assending order 
    traverse from the back of the array until everything is 0
    we delete 1 from every index every iterations
    after if we have any intervals left over we add that to the sum and start again */
}