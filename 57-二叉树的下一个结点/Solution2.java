/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        // 1有右子树，下一结点是右子树中的最左结点
        if(pNode.right != null){
            TreeLinkNode pRight = pNode.right;
            while(pRight.left != null){
                pRight = pRight.left;
            }
            return pRight;
        }
        // 无右子树，且结点是该结点父结点的左子树，则下一结点是该结点的父结点
        if(pNode.next != null && pNode.next.left == pNode){
            return pNode.next;
        }
        // 无右子树，且结点是该结点父结点的右子树，则我们一直沿着父结点追溯，直到找到某个结点是其父结点的左子树
        if(pNode.next != null){
            TreeLinkNode pNext = pNode.next;
            while (pNext.next != null && pNext.next.right == pNext) {
                pNext = pNext.next;
            }
            return pNext.next;
        }
        return null;
    }
}
