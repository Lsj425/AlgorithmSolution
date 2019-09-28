import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return list;
        }
        // 定义四个边界
        int up = 0;
        int down = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        while(true){
            // 最上面一行
            for(int col = left; col <= right; col++){
                list.add(matrix[up][col]);
            }
            up++; // 向下收缩
            // 判断是否越界
            if(up > down){
                break;
            }
            // 最右边一列
            for(int row = up; row <= down; row++){
                list.add(matrix[row][right]);
            }
            right--; // 向左收缩
            // 判断是否越界
            if(left > right){
                break;
            }
            // 最下面一行
            for(int col = right; col >= left; col--){
                list.add(matrix[down][col]);
            }
            down--; // 向上收缩
            // 判断是否越界
            if(up > down){
                break;
            }
            // 最左边一列
            for(int row = down; row >= up; row--){
                list.add(matrix[row][left]);
            }
            left++; // 向右收缩
            // 判断是否越界
            if(left > right){
                break;
            }
        }
        return list;
    }
}
