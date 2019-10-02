public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array == null || array.length == 0)return 0;
        int preValue = array[0];// 用来记录上一次的记录
        int count = 1; // preValue出现的次数（相减之后）
        for(int i = 1; i < array.length; i++){
            if(array[i] == preValue)
                count++;
            else{
                count--;
                if(count == 0){
                    preValue = array[i];
                    count = 1;
                }
            }
        }
        int num = 0;// 需要判断是否真的是大于半数
        for(int i = 0; i < array.length; i++)
            if(array[i] == preValue)
                num++;
        return (num > array.length/2)?preValue:0;
    }
}
