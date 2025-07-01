class Solution {
    public int possibleStringCount(String word) {
        HashMap<Character,Integer> hh=new HashMap<>();
        char prev=' ';
        for(char a:word.toCharArray()){
            if(prev==' '){
                prev=a;
                hh.put(a,hh.getOrDefault(a,0)+1);
                continue;
            }
            else if(a==prev){
                hh.put(a,hh.getOrDefault(a,0)+1);
            }
            else if(a!=prev && hh.containsKey(a)==false){
                hh.put(a,hh.getOrDefault(a,0)+1);
            }
            prev=a;
            
        }
        int count=1;
        for(char b:hh.keySet()){
            int val=hh.get(b);
            if(val>1){
                count+=val-1;
            }
        }
        return count;

    }
}