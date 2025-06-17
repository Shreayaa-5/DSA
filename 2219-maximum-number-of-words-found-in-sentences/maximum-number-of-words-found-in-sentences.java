class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        int n=sentences.length;
        for(int i=0;i<n;i++){
            String[] arr=sentences[i].split(" ");
            if(arr.length>count){
                count=arr.length;
            }
        }
        return count;
    }
}