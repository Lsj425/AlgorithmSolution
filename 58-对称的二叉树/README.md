## 题目描述
请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
## 解题思路
### 方法一：递归
判断当前左右节点值是否相等，相等则将左子树的左节点与右子树的右节点、左子树的右节点与右子树的左节点加入递归
### 方法二：DFS（非递归）
使用Stack来保存成对的节点，成对出栈时比较：

1. 若都为空，继续；
2. 一个为空，返回false;
3. 不为空，比较当前值，值不等，返回false；

确定入栈顺序，每次成对入栈，如left.left,right.right ;left.rigth,right.left
### 方法三：BFS（非递归）
使用Queue来保存成对的节点，成对出队时比较：

1. 若都为空，继续；
2. 一个为空，返回false;
3. 不为空，比较当前值，值不等，返回false；

确定入队顺序，每次成对入队，如left.left,right.right ;left.rigth,right.left
