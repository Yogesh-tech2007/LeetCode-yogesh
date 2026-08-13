// Last updated: 13/08/2026, 15:46:08
class Solution {
    public int maxDigitRange(int[] nums) {
        int marange = -1;
        int tosum = 0;
        for(int num: nums){
            int curtrange = getDigitRange(num);
            if(curtrange>marange){
                marange = curtrange;
                tosum = num;
            }
            else if(curtrange == marange){
                tosum += num;
            }
        }
        return tosum;
        
    }
    private int getDigitRange(int a){
        if(a == 0)
            return 0;
        a = Math.abs(a);
        int min =9;
        int max =0;
        while(a>0){
            int dig = a%10;
            if(dig<min)
                min = dig;
            if(dig>max)
                max=dig;
            a/=10;
        }
        return max - min;
    }
}