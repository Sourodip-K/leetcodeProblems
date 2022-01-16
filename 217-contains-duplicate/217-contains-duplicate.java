class Solution {
    public boolean containsDuplicate(int[] nums) {
    		HashSet<Integer> set = new HashSet<Integer>();
		for (Integer integer : nums) {
			// set will return false if we try to add duplicate elements
			if (!set.add(integer)) {
				// break the flow as soon as you will find the duplicate element
				return true;
			}
		}
		return false;   
    }
}