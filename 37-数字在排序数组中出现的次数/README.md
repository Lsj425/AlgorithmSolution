## 题目描述
统计一个数字在排序数组中出现的次数。

## 解题思路
由于数组是一个排序过的数组，所以可以用二分查找法，定位数字k的第一次出现位置和最后一次出现位置，相减加1即得该数字的出现次数。
