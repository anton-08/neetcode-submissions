class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int result = 0;
        int iterations = 0;
        int i = 0;
        int j = numbers.length - 1;
        int[] output = new int[2];
        while (result != target || iterations == 0) {
            result = numbers[i] + numbers[j];
            iterations++;
            if (result < target) {
                i++;
            } else if (result > target) {
                j--;
            }
        }
        output[0] = i + 1;
        output[1] = j + 1;
        return output;
    }
}
