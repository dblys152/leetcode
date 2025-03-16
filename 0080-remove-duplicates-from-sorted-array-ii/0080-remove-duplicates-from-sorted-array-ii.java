class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> numCountMap = new HashMap<>();
        numCountMap.put(nums[0], 1);
        int overwriteIndex = 1;
        int loofSize = nums.length;
        for (int i = 1; i < loofSize; i++) {
            int currentNumCount = numCountMap.merge(nums[i], 1, Integer::sum);
            if ((nums[i-1] == nums[i] && currentNumCount <= 2)
                    || nums[i-1] != nums[i]) {
                nums[overwriteIndex++] = nums[i];
            }
        }
        return overwriteIndex;
    }
}