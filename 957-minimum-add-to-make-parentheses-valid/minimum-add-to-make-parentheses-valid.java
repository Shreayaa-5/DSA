class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int i=0;
        int count=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            if(s.charAt(i)==')'){
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                } else {
                    count++; 
                }
            }
            i++;
        }
        return st.size()+count;
    }
}