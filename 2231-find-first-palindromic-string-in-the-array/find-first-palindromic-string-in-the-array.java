class Solution {
    public String firstPalindrome(String[] words) {
        int n=words.length;
        for(int i=0;i<n;i++){
            boolean palindrome=true;
            String a=words[i];
            for(int j=0;j<a.length()/2;j++){
                if(a.charAt(j)!=a.charAt(a.length()-1-j)){
                    palindrome=false;
                    break;
                }
            }
            if(palindrome){
                return a;
            }
        }
        return "";
    }
}