class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> smap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i = 0; i < t.length(); i++){
            if(smap.containsKey(t.charAt(i))){
                if(smap.get(t.charAt(i)) == 1){
                    smap.remove(t.charAt(i));
                }else{
                    smap.put(t.charAt(i), smap.get(t.charAt(i)) -1);
                }
            }else{
                return false;
            }
        }
        return smap.isEmpty();
    }
}