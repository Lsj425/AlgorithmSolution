public class Solution {
    public void reOrderArray(int [] array) {
        int len = array.length;
        int k = 0; // 记录已排好序的奇数个数
        for(int i = 0; i < len; i++){
            if(array[i]%2 == 1){
                int j = i;
                while(j > k){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    j--;
                }
                k++;
            }
        }
    }
}
