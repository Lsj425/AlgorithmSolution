public class Solution {
    public boolean Find(int target, int [][] array) {
        int rows = array.length;
        int columns = array[0].length;
        boolean result = false;
        if(array != null && rows > 0 && columns > 0){
            int row = 0;
            int col = columns - 1;
            
            while((row >= 0) && (row <= rows - 1) && (col >= 0) && (col <= columns - 1)){
                int temp = array[row][col];
                if(target > temp){
                    row++;
                }else if(target < temp){
                    col--;
                }else{
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
