class MinStack {
    private int[] stack;
    private int top;
    public MinStack() {
        stack=new int[10000];
        top=-1;
    }
    
    public void push(int val) {
        stack[++top]=val;
    }
    
    public void pop() {
        if(top>=0){
            top--;
        }else{
            throw new RuntimeException("Top from empty stack");
        }
    }
    
    public int top() {
        if(top>=0){
            return stack[top];
        }else{
            throw new RuntimeException("Top from empty stack");
        }
    }
    
    public int getMin() {
        if(top<0){
            throw new RuntimeException("Top from empty stack");
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=top;i++){
            if(stack[i]<min){
                min=stack[i];
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */