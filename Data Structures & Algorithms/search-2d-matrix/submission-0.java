class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //check largest value in every row
        // if larger than target, go to next row
        // if smaller then continue to iterate through the row

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j ++) {
                if (target == matrix[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
