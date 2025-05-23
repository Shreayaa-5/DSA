class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freqarray=new int[26];
        for(char c:s.toCharArray()){
            freqarray[c-'a']++;
        }
        boolean[] visited=new boolean[26];
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            freqarray[c-'a']--;
            if(visited[c-'a']) continue;
            
            while(!st.isEmpty() && st.peek()>c && freqarray[st.peek()-'a']>0){
                visited[st.pop()-'a']=false;
            }

            st.push(c);
            visited[c-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        for(char c:st) sb.append(c);
        return sb.toString();
    }
}