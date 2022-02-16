class Solution {
   public int removeElement(int[] nums, int a) {
        int f = 0;
        for (int i = 0; i < nums.length; i++) {
            if (a != nums[i])
                nums[f++] = nums[i];
        }
        return f;
    }
}