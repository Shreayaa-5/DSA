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
        hh.put("IV",4);
        hh.put("IX",9);
        hh.put("XL",40);
        hh.put("XC",90);
        hh.put("CD",400);
        hh.put("CM",900);
        int ans=0;
        boolean end_pair=false;
        for(int i=0;i<s.length()-1;i++){
            String a="";
            if(s.charAt(i)=='I' && s.charAt(i+1)=='V'){
                ans+=hh.get("IV");
                if(i==s.length()-2) end_pair=true;
                i++;
            }else if(s.charAt(i)=='I' && s.charAt(i+1)=='X'){
                ans+=hh.get("IX");
                if(i==s.length()-2) end_pair=true;
                i++;
            }else if(s.charAt(i)=='X' && s.charAt(i+1)=='L'){
                ans+=hh.get("XL");
                if(i==s.length()-2) end_pair=true;
                i++;
            }else if(s.charAt(i)=='X' && s.charAt(i+1)=='C'){
                ans+=hh.get("XC");
                if(i==s.length()-2) end_pair=true;
                i++;
            }else if(s.charAt(i)=='C' && s.charAt(i+1)=='D'){
                ans+=hh.get("CD");
                if(i==s.length()-2) end_pair=true;
                i++;
            }else if(s.charAt(i)=='C' && s.charAt(i+1)=='M'){
                ans+=hh.get("CM");
                if(i==s.length()-2) end_pair=true;
                i++;
            }else{
                ans+=hh.get(s.charAt(i)+"");
            }  
        }
        if(!end_pair){
            ans+=hh.get(s.charAt(s.length()-1)+"");
        }
        return ans;
    }
}