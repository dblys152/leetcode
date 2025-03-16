class Solution {
    public int removeElement(int[] nums, int val) {
        int overwriteIndex = 0;
        for(int num : nums) {
            if(num != val) {
                nums[overwriteIndex++] = num;
            }
        }
        return overwriteIndex;
    }
}