import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> TwoSum = new HashMap<Integer, Integer>();
        
        for(int i=0; i<nums.length; i++) {
            int complement = target-nums[i];
            if(TwoSum.containsKey(complement)) 
                return new int[]{TwoSum.get(complement),i};
            else
                TwoSum.put(nums[i], i);
            }
        return new int[]{};
        }
        
    
    
    }
        
        
        
        
        
//         Arrays.sort(nums);
//         int left = 0;
//         int right = nums.length - 1;
//         while(left < right) {
//             if(nums[left] + nums[right] == target) {
//                 return new int[] {left, right};
//             } else if (nums[left] + nums[right] < target) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }
//         return new int[] {};
// }
// }
        
        
//         for(int i=0; i<nums.length-1; i++) {
//             for(int j=i+1; j<nums.length; j++)
//             if(nums[i]+nums[j]==target) {
//                 return new int[]{i, j};
//             }
//         }
//         return new int[]{-1, -1};
//     }
// }
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i=0; i<nums.length-1;i++)
//             for(int j=i+1; j<nums.length; j++)
//                 if(target==nums[i]+nums[j])
//                     return new int[]{i,j};
//         return new int[]{-1,-1};
//     }
// }


