import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

/**
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
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return list;
        }
        queue.offer(root); // 节点入队
        while(!queue.isEmpty()){
            TreeNode head = queue.poll(); // 节点出队
            list.add(head.val); // 将当前节点值存入结果队列
            if(head.left != null){
                queue.offer(head.left); // 左节点入队
            }
            if(head.right != null){
                queue.offer(head.right); // 右节点入队
            }
        }
        return list;
    }
}
