class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // Use a deque to simulate the asteroid collisions
        Deque<Integer> deque = new ArrayDeque<>();

        // Iterate through the asteroids array
        for (int asteroid : asteroids) {
            // If asteroid is moving in the positive direction, add it to the deque
            if (asteroid > 0) {
                deque.addLast(asteroid);
            } else {
                // If asteroid is moving in the negative direction, check for collisions
                while (!deque.isEmpty() && deque.peekLast() > 0 && deque.peekLast() < -asteroid) {
                    // Remove smaller asteroids moving in the positive direction
                    deque.pollLast();
                }

                // Handle collisions with the incoming asteroid
                if (deque.isEmpty() || deque.peekLast() < 0) {
                    // If the deque is empty or the top is moving in the negative direction, add the incoming asteroid
                    deque.addLast(asteroid);
                } else if (deque.peekLast() == -asteroid) {
                    // If the top asteroid is the same size, both asteroids will explode
                    deque.pollLast();
                }
            }
        }

        // Convert the deque to an array representing the state of the asteroids after collisions
        int[] res = new int[deque.size()];
        int i = 0;
        for (int asteroid : deque) {
            res[i++] = asteroid;
        }
        return res;
    }
    /**
    Create a new stack and add the last element from the array into the stack
    compare the last element and the element in the stack to see which one is larger or if they are the same
    Get rid of the the one that is smaller and repeat for all the values
    */
}