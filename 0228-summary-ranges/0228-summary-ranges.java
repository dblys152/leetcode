class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums == null || nums.length == 0) {
            return List.of();
        }

        List<String> results = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int rangeStartIndex = 0;
        int loofSize = nums.length;
        for (int i = 0; i < loofSize; i++) {
            boolean isEndRange = (i == loofSize - 1) || (nums[i] + 1 != nums[i+1]);
            if (isEndRange) {
                results.add(rangeStartIndex == i 
                    ? sb.append(nums[i]).toString() 
                    : sb.append(nums[rangeStartIndex]).append("->").append(nums[i]).toString());
                rangeStartIndex = i + 1;
                sb.setLength(0);
            }
        }
        
        return results;
    }
}