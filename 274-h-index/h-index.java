class Solution {
    public int hIndex(int[] citations) {
        int max=0;
        int n=citations.length;
        int currcount=0;
        for(int i=n;i>0;i--){
            int count=0;
            for(int j=0;j<n;j++){
                if(citations[j]>=i) count++;
            }
            if(count>=i){
                max=Math.max(max,i);
            }
        } return max;
    }
}