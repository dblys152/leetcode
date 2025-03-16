class Solution {
    public int removeDuplicates(int[] nums) {
        int overwriteIndex = 1;
        int loofSize = nums.length;
        for (int i = 1; i < loofSize; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[overwriteIndex++] = nums[i];
            }
        }
        return overwriteIndex;
    }
}