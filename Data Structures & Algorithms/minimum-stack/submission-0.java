class MinStack {

    private Stack<long []> stack;

    public MinStack() {
        stack = new Stack<>();    
    }
    
    public void push(int val) {
        if(stack.isEmpty()) {
            stack.push(new long[] {val, val});
        } else {
            long currentMin = Math.min(val, stack.peek()[1]);
            stack.push(new long[]{val, currentMin});
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return (int) stack.peek()[0];
    }
    
    public int getMin() {
        return (int) stack.peek()[1];
    }
}
