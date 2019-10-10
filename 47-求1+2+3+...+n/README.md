## 题目描述
求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。

## 解题思路
1. 需利用逻辑与的短路特性实现递归终止
2. 当 n == 0时，(n>0)&&((sum+=Sum_Solution(n-1))>0) 只执行前面的判断，为 false，然后直接返回0
3. 当 n > 0 时，执行 sum += Sum_Solution(n-1)，实现递归计算Sum_Solution(n)。
