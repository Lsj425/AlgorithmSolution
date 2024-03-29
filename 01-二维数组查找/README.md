## 题目描述
在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

## 解题思路
### 方法一：左下/右上查找
时间复杂度：O(行高+列宽)<br>
空间复杂度：O(1)<br>
从左下角来看，向上数字递减，向右数字递增，因此从左下角开始查找，当要查找数字比左下角数字大时，右移。要查找数字比左下角数字小时，上移（也可从右上角查找）,由此可迅速排除一行的数据，降低时间复杂度

### 方法二：暴力搜索（使用二分法优化）
时间复杂度：O(nlogn)<br>
空间复杂度：O(1)<br>
遍历每一行，行内使用二分法优化
