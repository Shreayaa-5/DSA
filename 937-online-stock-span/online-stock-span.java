class StockSpanner {
    Stack<int[]> st;
    public StockSpanner() {
        st=new Stack<>();
    }
    
    public int next(int price) {
        int day=1;
        while(!st.isEmpty() && st.peek()[0]<=price){
            day+=st.pop()[1];
        }
        st.push(new int[] {price,day});
        return day;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */