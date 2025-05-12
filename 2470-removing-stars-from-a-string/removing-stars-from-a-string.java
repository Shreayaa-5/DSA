class Solution {
    public String removeStars(String s) {
        Character[] stack=new Character[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                stack[++top]=s.charAt(i);
            }
            else if(s.charAt(i)=='*'){
                top--;
            }
        }
        StringBuilder a=new StringBuilder();
        for(int i=0;i<top+1;i++){
            a.append(stack[i]);
        }
        return a.toString();
    }
}