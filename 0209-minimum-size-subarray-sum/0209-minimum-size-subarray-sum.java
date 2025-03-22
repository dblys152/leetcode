class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int startIndex = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int loofSize = nums.length;
        for (int i = 0; i < loofSize; i++) {
            sum += nums[i];

            while (sum > target) {
                sum -= nums[startIndex++];
                minLength = Math.min(minLength, i - startIndex + 1);
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}