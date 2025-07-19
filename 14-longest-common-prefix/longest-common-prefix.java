class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        int index=0;
        Arrays.sort(strs);
        if(strs.length==1) return strs[0];
        String first=strs[0];
        String last=strs[strs.length-1];
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){
                if(i==0){
                    return "";
                }
                return first.substring(0,i);
            }
        }
        return first.substring(0, Math.min(first.length(), last.length()));
    }
}