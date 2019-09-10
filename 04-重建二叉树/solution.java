/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	    TreeNode root = reConstructBinaryTree(pre, 0, pre.length-1, in, 0, in.length-1);
	    return root;
	}
	
	private TreeNode reConstructBinaryTree(int [] pre, int startPre, int endPre, int [] in, int startIn, int endIn){
	    if((startPre > endPre) || (startIn > endIn)){
	        return null;
	    }
	    
	    TreeNode root = new TreeNode(pre[startPre]);// 根据前序遍历序列确定根结点
	    
	    for(int i = startIn; i <= endIn; i++){
	        if(in[i] == pre[startPre]){// 在两个数组中找到当前子树的根结点位置，划分左右子树
	            root.left = reConstructBinaryTree(pre, startPre+1, startPre+i-startIn, in, startIn, i-1);
	            root.right = reConstructBinaryTree(pre, i-startIn+startPre+1, endPre, in, i+1, endIn);
	            break;
	        }
	    }
	    
	    return root;
	}
}
