import java.util.Stack;

public class Solution {
    
    private Stack stack1;// 存放当前栈的所有元素
    private Stack stack2;// 存放当前栈的最小元素
    // 初始化2个栈
    Solution(){
        this.stack1 = new Stack<Integer>();
        this.stack2 = new Stack<Integer>();
    }
    
    public void push(int node) {
        stack1.push(node);
        int min = (int)stack2.peek();
        if(stack2.empty() || node <= min){
            stack2.push(node);
        }
    }
    
    public void pop() {
        if(stack2.peek() == stack1.peek()){
            stack2.pop();
        }
        stack1.pop();
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int min() {
        return stack2.peek();
    }
}
