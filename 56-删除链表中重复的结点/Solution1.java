/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public ListNode deleteDuplication(ListNode pHead){
        // 只有0个或1个结点，则返回
        if(pHead == null || pHead.next == null){ 
            return pHead;
        }
        // 当前结点是重复结点
        if (pHead.val == pHead.next.val) { 
            ListNode pNode = pHead.next;
            while (pNode != null && pNode.val == pHead.val) {
                // 跳过值与当前结点相同的全部结点,找到第一个与当前结点不同的结点
                pNode = pNode.next;
            }
            // 从第一个与当前结点不同的结点开始递归
            return deleteDuplication(pNode); 
        }else{ // 当前结点不是重复结点
            // 保留当前结点，从下一个结点开始递归
            pHead.next = deleteDuplication(pHead.next); 
            return pHead;
        }
    }
}
