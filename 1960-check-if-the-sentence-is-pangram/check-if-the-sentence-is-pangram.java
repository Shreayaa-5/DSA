class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] arr=new int[26];
        for(int i=0;i<sentence.length();i++){
            arr[sentence.charAt(i)-'a']=1;
        }
        for(int i=0;i<26;i++){
            if(arr[i]==1){
                continue;
            }else{
                return false;
            }
        }
        return true;

        
    }
}