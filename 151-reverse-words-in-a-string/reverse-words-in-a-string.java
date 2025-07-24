class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(str));
        StringBuilder ss=new StringBuilder();
        for(int i=0;i<str.length;i++){
            ss.append(str[i]);
            if(i!=str.length-1) ss.append(" ");
        }
        return ss.toString();
    }
}