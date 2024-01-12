int maxArea(int* height, int heightSize) {
    int left = 0;                // Left pointer starting from the leftmost edge
    int right = heightSize - 1;  // Right pointer starting from the rightmost edge
    int maxWater = 0;            // Initialize the maximum water capacity

    while (left < right) {
        // Calculate the width of the container
        int width = right - left;

        // Calculate the height of the container (the minimum height between the two lines)
        int h = height[left] < height[right] ? height[left] : height[right];

        // Calculate the water capacity of the current container
        int water = width * h;

        // Update the maximum water capacity if the current container holds more water
        if (water > maxWater) {
            maxWater = water;
        }

        // Move the pointers towards each other
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }

    return maxWater;
}