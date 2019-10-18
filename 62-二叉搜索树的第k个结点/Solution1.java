/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    int index = 0; // 计数器
    TreeNode KthNode(TreeNode pRoot, int k){
        if(pRoot != null){ // 中序遍历寻找第k个
            TreeNode node = KthNode(pRoot.left,k);
            if(node != null){
                return node;
            }
            index++;
            if(index == k){
                return pRoot;
            }
            node = KthNode(pRoot.right,k);
            if(node != null){
                return node;
            }
        }
        return null;
    }
}
