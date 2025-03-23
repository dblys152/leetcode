class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums == null || nums.length == 0) {
            return List.of();
        }

        List<String> results = new ArrayList<>();
        int rangeStartIndex = 0;
        int loofSize = nums.length;
        for (int i = 0; i < loofSize; i++) {
            boolean isEndRange = (i == loofSize - 1) || (nums[i] + 1 != nums[i+1]);
            if (isEndRange) {
                results.add(rangeStartIndex == i 
                    ? String.valueOf(nums[i]) 
                    : nums[rangeStartIndex] + "->" + nums[i]);
                rangeStartIndex = i + 1;
            }
        }
        
        return results;
    }
}