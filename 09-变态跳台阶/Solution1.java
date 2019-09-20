public class Solution {
    public int JumpFloorII(int target) {
        int n = 1;
        for(int i = 2; i <= target; i++){
            n = 2*n;
        }
        return n;
    }
}
