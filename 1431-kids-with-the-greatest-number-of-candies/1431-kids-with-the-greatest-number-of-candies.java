class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new LinkedList<>();
        int max = candies[0];
        for(int candy: candies){
            if(candy > max){
                max = candy;
            }
        }
        for(int candy: candies){
            list.add(candy+extraCandies >= max);
        }
        return list;
    }
}