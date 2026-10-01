class StockSpanner {
    Stack<int []> st;
    public StockSpanner() {
        st=new Stack<>();
    }
    
    public int next(int price) {
        int p=1;
        while(!st.isEmpty() && price>=st.peek()[0]){
            p+=st.peek()[1];
            st.pop();
        }
        st.push(new int[]{price,p});
        return p;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */