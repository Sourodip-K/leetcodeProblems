class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int output[]=new int[len];
        int product=1;
    //finding out the cummulative multiplication from left side
        for(int i=0; i<len; i++) {
            product=product*nums[i];
            output[i]=product;
        }
    //generating output
        product = 1;
        for(int i=len-1; i>0; --i) {
            output[i]=output[i-1]*product;
            product=product*nums[i];
        }
        output[0]=product;
        return output;
        
    }
}