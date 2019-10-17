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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Deque;
import java.util.ArrayDeque;
public class Solution {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        HashMap<TreeNode, Integer> map = new HashMap<>();
        if (pRoot == null) {
            return lists;
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.addFirst(pRoot);
        map.put(pRoot, 0);// 保存节点及其对应的层数
        while (!queue.isEmpty()) {
            pRoot = queue.pollLast();
            int deep = map.get(pRoot);
            if (pRoot.left != null) {
                queue.addFirst(pRoot.left);
                map.put(pRoot.left, deep + 1);
            }
            if (pRoot.right != null) {
                queue.addFirst(pRoot.right);
                map.put(pRoot.right, deep + 1);
            }
            if (lists.size() <= deep) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(pRoot.val);
                lists.add(list);
            } else {
                ArrayList<Integer> list = lists.get(deep);
                list.add(pRoot.val);
            }
        }
        return lists;
    }
}
