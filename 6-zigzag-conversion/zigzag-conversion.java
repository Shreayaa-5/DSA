class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;
        List<List<Character>> l=new ArrayList<>();
        int idx=0;
        int d=1;
        for(int i=0;i<numRows;i++){
            List<Character> g=new ArrayList<>();
            l.add(g);
        }
        for(int i=0;i<s.length();i++){
            if(idx==numRows-1){
                d=-1;
            }
            if(idx==0){
                d=1;
            }
            l.get(idx).add(s.charAt(i));
            idx+=d;
        }
        StringBuilder ss=new StringBuilder();
        for(int i=0;i<numRows;i++){
            for(int j=0;j<l.get(i).size();j++){
                ss.append(l.get(i).get(j));
            }
        }
        return ss.toString();
    }
}