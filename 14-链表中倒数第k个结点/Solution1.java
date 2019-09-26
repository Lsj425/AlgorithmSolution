/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode pre = null,after = null;
        after = head;
        pre = head;
        //记录k值
        int a = k;
        //记录节点的个数
        int count = 0;
        //pre指针先跑，并且记录节点数，当pre指针跑了k-1个节点后，after指针开始跑，
        //当p指针跑到最后时，pre所指指针就是倒数第k个节点
        while(pre != null){
            pre = pre.next;
            count++;
            if(k < 1){
                after = after.next;
            }
            k--;
        }
        //如果节点个数小于所求的倒数第k个节点，则返回空
        if(count<a) return null;
        return after;
    }
}
