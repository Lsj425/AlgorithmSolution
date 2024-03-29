/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        // 如果链表为空或者链表中只有一个元素
        if(head == null|| head.next == null) return head;
         
        // 先反转后面的链表，走到链表的末端结点
        ListNode pReverseNode = ReverseList(head.next);
         
        // 再将当前节点设置为后一节点的后续节点
        head.next.next = head;
        head.next = null;
         
        return pReverseNode;
    }
}
