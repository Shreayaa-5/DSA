class Solution {
    public boolean isPalindrome(String s) {
        boolean pal=true;
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            // Skip non-alphabet characters from right
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}