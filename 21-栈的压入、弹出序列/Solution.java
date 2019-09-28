import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length == 0 || popA.length == 0){
            return false;
        }
        Stack<Integer> stack = new Stack<>();// 辅助栈
        // 用于标识弹出序列的位置
        int popIndex = 0;
        for(int i = 0; i < pushA.length; i++){
            stack.push(pushA[i]);
            // 如果栈不为空，且栈顶元素等于弹出序列
            while(!stack.empty() && stack.peek() == popA[popIndex]){
                //出栈
                stack.pop();
                //弹出序列向后一位
                popIndex++;
            }
        }
        return stack.empty();
    }
}
