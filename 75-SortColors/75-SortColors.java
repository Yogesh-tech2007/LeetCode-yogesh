// Last updated: 13/08/2026, 15:54:47
class Solution {
    public void sortColors(int[] nums) {
       
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {  
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
