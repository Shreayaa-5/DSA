class Solution {
    public int evalRPN(String[] tokens) {
        int size=tokens.length;
        int[] stack=new int[size];
        List<String> oper = Arrays.asList("+", "-", "/", "*");
        int top=-1;
        for(int i=0;i<size;i++){
            if(oper.contains(tokens[i])){
                int b=stack[top--];
                int a=stack[top--];
                int c=0;
                if(tokens[i].equals("+")){
                    c=a+b;
                }else if(tokens[i].equals("-")){
                    c=a-b;
                }else if(tokens[i].equals("/")){
                    c=a/b;
                }else if(tokens[i].equals("*")){
                    c=a*b;
                }else{
                    System.out.println("Error");
                }
                stack[++top]=c;
            }
            else{
                stack[++top]=Integer.parseInt(tokens[i]);
            }
        }
        return stack[top];
    }
}