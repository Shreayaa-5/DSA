class Solution {
    public int maxNumberOfBalloons(String text) {
        int bc=0,ac=0,lc=0,oc=0,nc=0;
        for (char i:text.toCharArray()){
            if(i=='b') bc++;
            if(i=='a') ac++;
            if(i=='l') lc++;
            if(i=='o') oc++;
            if(i=='n') nc++;
        }
        return Math.min(bc,(Math.min(ac,Math.min(lc/2,Math.min(oc/2,nc)))));
    }
}