import java.util.LinkedList;
public class Solution {
    public int LastRemaining_Solution(int n, int m){
        if(m == 0 || n == 0){
            return -1;
        }
        LinkedList<Integer> data = new LinkedList<Integer>();
        for(int i = 0; i < n; i++){
            data.add(i);
        }
        int index = -1;
        while(data.size() > 1){
            index = (index + m) % data.size();// 实现环形链表的功能
            data.remove(index);
            index--;
        }
        return data.get(0);
    }
}
