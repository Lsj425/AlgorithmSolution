## 题目描述
请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。(如果当前字符流没有存在出现一次的字符，返回#字符。)

## 解题思路
1. 利用一个int型数组表示256个字符，这个数组初值置为0
2. 每读出一个字符，则将以该字符为下标的数组值置1，如果该数组值不为0则置-1
3. 取出数组中值为1的字符，判断非溢出后返回该数值的下标
