## 题目描述
输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。

## 解题思路
### 方法一：递归
1. 核心是中序遍历的非递归算法。
2. 修改当前遍历节点与前一遍历节点的指针指向。
### 方法二：非递归
1. 将左子树构造成双链表，并返回链表头节点。
2. 定位至左子树双链表最后一个节点。
3. 如果左子树链表不为空的话，将当前root追加到左子树链表。
4. 将右子树构造成双链表，并返回链表头节点。
5. 如果右子树链表不为空的话，将该链表追加到root节点之后。
6. 根据左子树链表是否为空确定返回的节点。
