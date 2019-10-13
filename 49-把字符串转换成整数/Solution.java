public class Solution {
    // 全局变量，标识输入是否有效
    static boolean isValid = false;
    public int StrToInt(String str) {
        // 判断无效输入
        if(str == null || str.length() <= 0){
            return 0;
        }
        char[] chars = str.toCharArray();
        // 用long来存储，以防止越界
        long num = 0;
         // 用来标识符号位
        boolean minus = false;
        for(int i = 0; i < chars.length; i++){
            if(i == 0 && chars[i] == '-'){
                minus=true;
            }else if(i == 0 && chars[i] == '+'){
                minus=false;
            }else{
                // 根据Ascll码值把相应的数字字符转换成整型数
                int a = (int)(chars[i]-'0');
                // 判断转换的字符是否为数字
                if(a < 0 || a > 9){
                    isValid = false; 
                    return 0;
                }
                // 将转换字符拼接成十进制数
                num = (minus==false) ? num*10+a : num*10-a;
                // 不放在最后面是为了防止str=‘+’的情况被判断为true
                isValid = true;
                // 判断是否溢出
                if((!minus && num > 0x7FFFFFFF) || (minus && num < 0x80000000)){
                    isValid = false;
                    return 0;
                }
            }
        }
        return (int)num;
    }
}
