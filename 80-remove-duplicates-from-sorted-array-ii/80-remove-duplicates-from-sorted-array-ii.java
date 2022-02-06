class Solution {
    public int removeDuplicates(int[] nums) {
     int n = nums.length, i = 2;
            for (int j = 2; j < n; i++, j++){
                while(j < n && nums[j] == nums[i - 1] && nums[j] == nums[i - 2]) j++;
                if (j == n) break;
                nums[i] = nums[j];
            }

            return Math.min(i, n);
        }
    }