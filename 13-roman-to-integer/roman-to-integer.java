class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer> hh=new HashMap<>();
        hh.put("I",1);
        hh.put("V",5);
        hh.put("X",10);
        hh.put("L",50);
        hh.put("C",100);
        hh.put("D",500);
        hh.put("M",1000);
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            if(hh.get(s.charAt(i)+"")<hh.get(s.charAt(i+1)+"")){
                ans-=hh.get(s.charAt(i)+"");
            }else{
                ans+=hh.get(s.charAt(i)+"");
            }
        }
        return ans+=hh.get(s.charAt(s.length()-1)+"");
    }
}