import java.util.Arrays;
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int length = array.length;
        int count = 0;
        if(length == 0){
            return 0;
        }else if(length == 1){
            return array[0];
        }else{
            int num = array[array.length/2];
            for(int i = 0; i < length; i++){
                if(num == array[i])
                    count++;
            }
            if(count <= (length/2)){
                num = 0;
            }
            return num;
        }
    }
}
