## 题目描述
用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。

## 解题思路
1. 入队：将元素压进stack1
2. 出队：判断stack2是否为空，如果为空，则pop所有stack1中的元素，并push进stack2，stack2出栈；如果不为空，stack2直接出栈。
