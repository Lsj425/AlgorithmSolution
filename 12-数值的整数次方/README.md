## 题目描述
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方（base和exponent不同时为0）。

## 解题思路
举例：10<sup>1101</sup> = 10<sup>0001</sup>×10<sup>0100</sup>×10<sup>1000</sup>，因此可将指数以2进制位表示，通过&1和>>1来逐位读取二进制数。
1. &1操作判断当前位是否为1，为1时则做累乘操作，为0则跳过。
2. 二进制数右移，判断下一位
