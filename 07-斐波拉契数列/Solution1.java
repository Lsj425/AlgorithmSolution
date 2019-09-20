public class Solution {
    public int Fibonacci(int n) {
        if(n <= 1){
            return n;
        }
        int f1 = 1, f2 = 1, next = 1;
        for(int i = 3; i <= n; i++){
            next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
        return next;
    }
}
