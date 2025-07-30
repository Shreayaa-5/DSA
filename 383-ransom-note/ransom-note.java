class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> mm=new HashMap<>();
        HashMap<Character,Integer> rr=new HashMap<>();
        for(Character a:magazine.toCharArray()){
            mm.put(a,mm.getOrDefault(a,0)+1);
        }
        for(Character a:ransomNote.toCharArray()){
            rr.put(a,rr.getOrDefault(a,0)+1);
        }
        boolean ans=true;
        for(Character a:rr.keySet()){
            if(mm.getOrDefault(a,0)<rr.get(a)){
                ans=false;
            }
        }
        return ans;
    }
}