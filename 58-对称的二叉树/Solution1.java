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
    boolean isSymmetrical(TreeNode pRoot){
        if(pRoot == null) return true;
        return isSymmetrical(pRoot.left, pRoot.right);
    }
    
    private boolean isSymmetrical(TreeNode left, TreeNode right) {
            if(left == null && right == null) return true;
            if(left == null || right == null) return false;
            return left.val == right.val // 镜像条件：左右节点值相等
                    && isSymmetrical(left.left, right.right) // 对称的子树也是镜像
                    && isSymmetrical(left.right, right.left);
    }
}
