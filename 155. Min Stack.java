public class MinStack {
    
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();

    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        stack.push(x);
        if(minStack.empty()) {
            minStack.push(x);
        } else {
            int min = minStack.pop();
            if(min >= x) {
                minStack.push(min);
                minStack.push(x);
            } else {
                minStack.push(min);
            }
        }
    }
    
    public void pop() {
        int pop = stack.pop();
        if(pop == getMin()) {
            minStack.pop();
        }
    }
    
    public int top() {
        int top = stack.pop(); stack.push(top);
        return top;
    }
    
    public int getMin() {
        int top = minStack.pop(); minStack.push(top);
        return top;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */