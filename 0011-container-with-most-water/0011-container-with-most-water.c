int maxArea(int* height, int heightSize) {
    int left = 0;
    int right = heightSize-1;
    int max = 0;
    while(left <= right){
        int smallest = height[left];
        char small = 'l';
        if(height[left] > height[right]){
            smallest = height[right];
            small = 'r';
        }
        if(smallest*(right-left) > max){
            max = smallest*(right-left);
        }
        if(small == 'r'){
            right--;
        }else{
            left++;
        }
    }
    return max;
}