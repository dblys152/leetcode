class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int loofSize = m + n;
        int nums2Length = nums2.length;
        int nums2Index = 0;
        for (int i = 0; i < loofSize; i++) {
            if (nums1[i] == 0 && nums2Index < nums2Length) {
                nums1[i] = nums2[nums2Index++];
            }
        }
        Arrays.sort(nums1);
    }
}