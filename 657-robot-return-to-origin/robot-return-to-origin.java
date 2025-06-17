class Solution {
    public boolean judgeCircle(String moves) {
        int up=0;
        int right=0;
        for(char c:moves.toCharArray()){
            if(c=='U'){
                up++;
            }else if(c=='D'){
                up--;
            }else if(c=='R'){
                right++;
            }else if(c=='L'){
                right--;
            }
        }
        return (up==0 && right==0);
    }
}