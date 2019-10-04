public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if(str == null || str.length() == 0){
            return -1;
        }
        int[] count = new int[256];
        // 第一次遍历记录每个字母出现的次数
        for(int i = 0; i < str.length(); i++){
            count[str.charAt(i)]++;
        }
        // 第二次遍历找出只出现一次的字母
        for(int i = 0; i < str.length(); i++){
            if(count[str.charAt(i)] == 1)
                return i;
        }
        return -1;
    }
}
