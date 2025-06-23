class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> hh=new HashMap<>();
        for(char x:t.toCharArray()){
            hh.put(x,hh.getOrDefault(x,0)+1);
        }
        HashMap<Character,Integer> ss=new HashMap<>();
        for(char y:s.toCharArray()){
            ss.put(y,ss.getOrDefault(y,0)+1);
        }
        for(char z:t.toCharArray()){
            int tt=hh.get(z);
            int se=ss.getOrDefault(z,0);
            if(tt>se){
                return z;
            }
            
        }
        return '\0';
    }
}