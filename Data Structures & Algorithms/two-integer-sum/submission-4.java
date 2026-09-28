class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> pairs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            pairs.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int result;
            result = target - nums[i];
            if (pairs.containsKey(result) && pairs.get(result) != i) {
                int[] output = new int[2];
                output[0] = i;
                output[1] = pairs.get(result);
                return output;
            }
        }
        int[] empty = new int[2];
        return empty;
    }
}
