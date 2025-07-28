class Solution {
    public String intToRoman(int num) {
        Map<Integer, String> m = new LinkedHashMap<>();
        m.put(1000, "M");
        m.put(900, "CM");
        m.put(500, "D");
        m.put(400, "CD");
        m.put(100, "C");
        m.put(90, "XC");
        m.put(50, "L");
        m.put(40, "XL");
        m.put(10, "X");
        m.put(9, "IX");
        m.put(5, "V");
        m.put(4, "IV");
        m.put(1, "I");
        String ss="";
        for(int i:m.keySet()){
            int n=num/i;
            if(n>=1){
                num-=i*n;
                ss+=m.get(i).repeat(n);
            }
        }
        System.out.println(ss);
        return ss;
    }
}