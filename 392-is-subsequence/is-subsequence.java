class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        while(j<t.length()){
            if(i==s.length()){
                System.out.println(i+" "+j);
                return true;
            } 
            if(s.charAt(i)==t.charAt(j)){
                System.out.println(s.charAt(i)+" "+t.charAt(j));
                i++;
                j++;
            }else{
                j++;
            }
        }
        System.out.println(i+" "+j);
        if(j==t.length() && i==s.length()) return true;
        return false;
    }
}