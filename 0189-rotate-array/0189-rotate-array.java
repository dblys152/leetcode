class Solution {
    public void rotate(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<>();

        for (int num : nums) {
            deque.add(num);
        }

        for(int i = 0; i < k; i++) {
            deque.addFirst(deque.removeLast());
        }

        int i = 0;
        for(int num : deque) {
            nums[i++] = num;
        }
    }
}