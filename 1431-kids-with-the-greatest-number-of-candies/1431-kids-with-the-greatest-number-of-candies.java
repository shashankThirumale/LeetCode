class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = 0;
        for(int i = 0; i < candies.length; i++){
            if(candies[i]>greatest){
                greatest = candies[i];
            }     
        }
        
        ArrayList<Boolean> list= new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= greatest){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}