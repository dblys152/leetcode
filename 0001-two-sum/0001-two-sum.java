class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueIndexMap = new HashMap<>();
        int numsLength = nums.length;
        for(int i = 0; i < numsLength; i++) {
            int needValue = target - nums[i];

            if (valueIndexMap.containsKey(needValue)) {
                return new int[]{valueIndexMap.get(needValue), i};
            }

            valueIndexMap.put(nums[i], i);
        }

        return new int[]{0, 1};
    }
}