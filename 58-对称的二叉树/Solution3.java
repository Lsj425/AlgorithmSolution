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
import java.util.LinkedList;
import java.util.Queue;
public class Solution {
    boolean isSymmetrical(TreeNode pRoot){
        if(pRoot == null) return true;
        Queue<TreeNode> s = new LinkedList<>();
        s.offer(pRoot.left);
        s.offer(pRoot.right);
        while(!s.isEmpty()) {
            TreeNode left = s.poll();// 成对取出
            TreeNode right = s.poll();
            if(left == null && right == null) continue;
            if(left == null || right == null) return false;
            if(left.val != right.val) return false;
            // 成对插入
            s.offer(left.left);
            s.offer(right.right);
            s.offer(left.right);
            s.offer(right.left);
        }
        return true;
    }
}
