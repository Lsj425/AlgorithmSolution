public class Solution {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        // 判断数组是否为空
        if(numbers == null || numbers.length == 0){
            return false;
        }
        for(int i = 0; i < length; i++){
            while(numbers[i] != i){
                // 判断第i位的数字是否为以第i位数字值为下标的数字，是的话则重复
                if(numbers[i] == numbers[numbers[i]]){
                    duplication[0] = numbers[i];
                    return true;
                }
                // 将第i位数字与以第i位数字值为下标的数交换
                int tmp = numbers[i];
                numbers[i] = numbers[tmp];
                numbers[tmp] = tmp;
            }
        }
        return false;
    }
}
