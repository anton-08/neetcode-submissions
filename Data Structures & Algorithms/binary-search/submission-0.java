class Solution {
    public int search(int[] nums, int target) {
        Map<Integer, Integer> pairs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            pairs.put(nums[i], i);
        }
        if (pairs.containsKey(target)) {
            return pairs.get(target);
        }
        return -1;
    }
}
