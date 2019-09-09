import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        // 节点值正序入栈，出栈时自动反序
        while(listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
         
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
}
