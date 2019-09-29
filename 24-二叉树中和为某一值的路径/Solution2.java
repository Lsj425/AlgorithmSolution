import java.util.ArrayList;
import java.util.Stack;

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

	ArrayList<Integer> path = new ArrayList<Integer>();
	ArrayList<ArrayList<Integer>> pathList = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		if(root==null) {
			return pathList;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode lastNode;
		path.add(root.val);
		target -= root.val;
		stack.push(root);
		root = root.left;
		while(root!=null || !stack.isEmpty()) {
			// 首先从根节点添加到最左端节点，将每一个节点的值添加进path中
			while(root!=null) {
				path.add(root.val);
				target -= root.val;
				stack.push(root);
				root = root.left;
			}
			/**
			 * 避免由于栈中弹出了对应元素，而该元素存在右节点，此时在弹出该元素的右节点之后需要将path跟stack一致，相当于清除操作
			 *     10
			 *    /  \
			 *   5    12
			 *  / \     
			 * 4   7
			 *  stack:10-->5-->4	path:10,5,4   此时stack弹出4，由于左右节点都为null，所以已经该条路径已经结束，path删除4
			 *  stack:10-->5		path:10,5	此时stack弹出5,由于5节点还存在子节点，所以不能在path中删除（留下了隐患）
			 *  stack:10-->7	path：10,5,7             满足条件（该条路径和为target，并且该条路劲上的最终节点是叶子结点）
			 *  stack：10		path：10,5		由于7节点子节点为空，弹出7节点；
			 *  	上次栈中弹出5，但是又在path中未删除5，现在需要将path中的5清除
			 *  	stack.peek().val)!=(path.get(path.size()-1
			 *  stack：12		path：10	,12			弹出10，使得12入栈
			 *  最终将10-->5-->7  10-->12  添加进pathList中
			 *  
			 */
			while((stack.peek().val)!=(path.get(path.size()-1))){
				target += path.get(path.size()-1);
				path.remove(path.size()-1);
			}
			if(target==0 && stack.peek().left==null) {
				pathList.add(new ArrayList<Integer>(path));
			}
			// 左节点到null之后，需要去找到右节点对应的元素，通过推栈来实现
			if(!stack.isEmpty()) {
				root = stack.pop();
				lastNode = root;
				root = root.right;
				if(root==null) {
					path.remove(path.size()-1);
					target += lastNode.val;
					
				}
			}
		}
		return pathList;
    }
}
