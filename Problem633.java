class Solution {
    public boolean judgeSquareSum(int c) {
        for(int i=(int)Math.sqrt(c);i*i>=0;i--){
            double x=Math.sqrt(c-i*i);
            if(x==Math.floor(x)){
                return true;                
            }
        }

        return false;
    }
}
