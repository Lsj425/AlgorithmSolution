import java.util.ArrayList;
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
    private ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> list = new ArrayList<>();// 路径数组
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null){
            return result;
        }
        list.add(root.val); // 存入当前节点值
        target -= root.val; // 计算剩余值
        if(target == 0 && root.left == null && root.right == null){
            result.add(new ArrayList<Integer>(list));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        // 遍历到叶节点都未找到合法路径
        // 则移除当前叶节点，回退到父节点从另一路径继续寻找
        list.remove(list.size()-1);
        return result;
    }
}
