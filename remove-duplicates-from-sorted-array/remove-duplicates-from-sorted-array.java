class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int replace = 0;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (i == 0) count++;
            
            if (nums[replace] != nums[i]) {
                replace++;
                int tmp = nums[replace];
                nums[replace] = nums[i];
                nums[i] = tmp;
                count++;
            }
        }
        
        return count;
    }
}