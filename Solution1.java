public class Solution {
    public int JumpFloor(int target) {
        if(target <= 1){
            return target;
        }
        int f1 = 1, f2 = 2, next = 2;
        for(int i = 3; i <= target; i++){
            next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
        return next;
    }
}
