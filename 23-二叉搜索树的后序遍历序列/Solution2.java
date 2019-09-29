public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        int size = sequence.length;
        if(0 == size) return false;
 
        int i = 0;
        while(--size != 0)
        {
            while(sequence[i++] < sequence[size]);
            while(sequence[i++] > sequence[size]);
 
            if( i < size) return false;
            i = 0;
        }
        return true;
    }
}
