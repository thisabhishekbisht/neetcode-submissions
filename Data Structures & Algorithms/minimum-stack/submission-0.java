class MinStack {
   private Stack<Integer> stack =  new Stack<>();
   private Stack<Integer> minStack =  new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
        else
        {
            minStack.push(minStack.peek());
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return ;
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
            if(stack.isEmpty()) return -1 ;
      return  stack.peek();
    }
    
    public int getMin() {
            if(stack.isEmpty()) return -1;
      return  minStack.peek();
    }
}
