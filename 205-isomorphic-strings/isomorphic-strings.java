class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Integer> word=new HashMap<>();
        Map<Character,Integer> word2=new HashMap<>();
        
        
        for (int i=0;i<s.length();i++){
            if(!word.containsKey(s.charAt(i))){
                word.put(s.charAt(i),i);
            }
            // if hashmap doesnt contain that character we add it with its index
            if(!word2.containsKey(t.charAt(i))){
                word2.put(t.charAt(i),i);
            }
            //char at hashmap 1 index not equal to hashmap2 returns false
            if(!word.get(s.charAt(i)).equals(word2.get(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}