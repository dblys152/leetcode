class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int mostCount = 0;
        int result = nums[0];
        for (int num : nums) {
            int count = countMap.merge(num, 1, Integer::sum);
            if (count > mostCount) {
                mostCount = count;
                result = num;
            }
        }
        return result;
    }
}