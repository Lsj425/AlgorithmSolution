public class Solution {
    public double Power(double base, int exponent) {
        double res = 1,curr = base;
        int p;
        if(exponent > 0){
            p = exponent;
        }else if(exponent < 0){
            p = -exponent;
        }else{
            return 1;// 0的0次方
        }
        while(p != 0){
            if((p&1)==1){
                res*=curr;
            }
            curr*=curr;// 翻倍
            p>>=1;// 右移一位
        }
        return exponent>=0?res:(1/res);   
  }
}
