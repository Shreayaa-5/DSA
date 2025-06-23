class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hh=new HashMap<>();
        for(char x:s.toCharArray()){
            hh.put(x,hh.getOrDefault(x,0)+1);
        }
        int count=0;
        boolean a=false;
        for(int i:hh.values()){
            if(i%2==0){
                count+=i;
            }else{
                count+=i-1;
                a=true;
            }
        }
        if(a){
            count++;
        }
        return count;
    }
}