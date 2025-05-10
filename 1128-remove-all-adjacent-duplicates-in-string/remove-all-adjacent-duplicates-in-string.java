class Solution {
    public String removeDuplicates(String s) {
        char[] arr=new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++){
            char ss=s.charAt(i);
            if(top>=0 && arr[top]==ss){
                --top;
            }else {
                arr[++top]=ss;
            }
        }
        return new String(arr,0,top+1);
    }
}