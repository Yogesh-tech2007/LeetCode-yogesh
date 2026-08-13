// Last updated: 13/08/2026, 15:46:05
import java.util.*;
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int lef=0;
        int rig = nums.length-1;
        while(lef<rig){
            int temp = nums[lef];
            nums[lef]=nums[rig];
            nums[rig]=temp;
            lef++;
            rig--;
            
        }
        long tsum = 0;
        int ind =0;
        while(ind<k){
            if(mul>1){
                tsum +=(long)nums[ind]*mul;
            }else{
                tsum+=nums[ind];
            }
            mul--;
            ind++;
        }
         return tsum;       
            }
        }
        