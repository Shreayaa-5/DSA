class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> br=new HashMap<>();
        br.put('[',']');
        br.put('{','}');
        br.put('(',')');
        char[] arr=new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(br.containsKey(c)){
                //inc then insert
                arr[++top]=c;
            }
            else if(br.containsValue(c)){
                //top-- first use val then decr
                if(top==-1 || br.get(arr[top--])!=c){
                    return false;
                }
            }
        }
        return top == -1;
    }
}